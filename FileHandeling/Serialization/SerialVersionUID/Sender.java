import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) throws Exception {
        Demo1 d1 = new Demo1();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
    }    
}
