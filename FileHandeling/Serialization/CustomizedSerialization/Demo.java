import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; 

class Account implements Serializable {

    String username = "Yash Khati";
    transient String password = "Yash@123";
    
    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();

        String encryptPassword = "123"+password;
        os.writeObject(encryptPassword);
    }
    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String epswd = (String) is.readObject(); 
        password = epswd.substring(3); 
    }
}

public class Demo {
    public static void main(String[] args) throws Exception {
        
        Account obj = new Account();
        System.out.println("Username : "+obj.username +" Password "+obj.password);

        FileOutputStream fos = new FileOutputStream("Demo1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);


        FileInputStream fis = new FileInputStream("Demo1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account obj2 = (Account)ois.readObject();


        System.out.println("Username : "+obj2.username +" Password "+obj2.password);
    }
    
}