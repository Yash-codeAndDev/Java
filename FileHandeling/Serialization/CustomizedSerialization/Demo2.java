/*
 Learning how to handel more than one transient variable 
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; 

class Account2 implements Serializable {

    String username = "Yash Khati";
    transient String password = "Yash@123";
    transient int pin = 2233;
    transient int cvv = 221;

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();

        String encryptPassword = "123"+password;
        os.writeObject(encryptPassword);

        int epin = 105+ pin;
        os.writeInt(epin);
        
        int ecvv = 102+cvv;
        os.writeInt(ecvv);
    }
    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String epswd = (String) is.readObject(); 
        password = epswd.substring(3); 

        int epin = is.readInt();
        pin = epin - 105;

        int dcvv = is.readInt();
        cvv = dcvv - 102;
    }
}

public class Demo2 {
    public static void main(String[] args) throws Exception {
        
        Account2 obj = new Account2();
        System.out.println("Username : "+obj.username +"\t Password : "+obj.password+"\t Pin :"+obj.pin+"\t cvv :"+obj.cvv);

        FileOutputStream fos = new FileOutputStream("Demo2.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);


        FileInputStream fis = new FileInputStream("Demo2.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account2 obj2 = (Account2)ois.readObject();

        System.out.println("Username : "+obj2.username +"\t Password "+obj2.password+"\t Pin : "+obj2.pin+"\t cvv :"+obj2.cvv);
    }
    
}