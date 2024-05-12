import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
    1) No use of making static variable  transient as it will not participate in serialization
    2) Final vatiable will participate in serialization directly by value . hence declaring final variable as transient there is no impact.
*/
class User3 implements Serializable {
    
    static String univ = "GEHU";
    final int uroll = 20188;
    transient final int sroll = 20112; 
    String username;
    transient String password;
    String email;

    public User3(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

public class Demo3{
    public static void main(String[] args) throws Exception{
        
        User3 uobj = new User3("YashCodeAndDev","abcde123","yash23@gmail.com");

        // Serialization
        FileOutputStream fos = new FileOutputStream("abc3.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(uobj);
    
        FileInputStream fis = new FileInputStream("abc3.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        User3 d2 = (User3)ois.readObject();
        System.out.println(d2.username+" "+d2.password+" "+d2.email +" "+d2.univ+" "+d2.sroll+" "+d2.uroll);
    }   
}