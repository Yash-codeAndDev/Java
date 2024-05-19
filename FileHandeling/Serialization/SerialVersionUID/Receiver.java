import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo1 obj= (Demo1)ois.readObject();
        System.out.println(obj.i +"---"+obj.j);
    }
}
