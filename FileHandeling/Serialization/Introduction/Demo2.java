import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserDetails implements Serializable {
    
    String username;
    transient String password;
    String email;

    public UserDetails(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

public class Demo2{
    public static void main(String[] args) throws Exception{
        
        UserDetails uobj = new UserDetails("YashCodeAndDev","abcde123","yash23@gmail.com");

        // Serialization
        FileOutputStream fos = new FileOutputStream("abc2.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(uobj);
    
        FileInputStream fis = new FileInputStream("abc2.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        UserDetails d2 = (UserDetails)ois.readObject();
        System.out.println(d2.username+" "+d2.password+" "+d2.email);
    }   
}