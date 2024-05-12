import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
    int age;
    String name;
    String Breed;

    public Dog(int age,String name, String Breed){
        this.age = age;
        this.name = name;
        this.Breed = Breed;
    }
}

public class Demo{
    public static void main(String[] args) throws Exception{
        
        Dog dobj = new Dog(5, "Oscar", "German Sephard");

        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dobj); // writing object to file 
    
        // Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject(); // reading object form file

        System.out.println(d2.Breed+" "+d2.name+" "+d2.age);
    }   
}