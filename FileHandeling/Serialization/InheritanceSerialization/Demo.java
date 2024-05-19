/*
 2 type of inheritance inheritance
 Case 1:
 */

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
    String name = "Yash";
    int age = 22;
}

class B extends A{
    int univ = 201317;
}

public class Demo {

    public static void main(String[] args) throws Exception {
        
        B obj = new B();
        System.out.println("name : "+obj.name+" age : "+obj.age+" univ : "+ obj.univ);
        
        FileOutputStream fos = new FileOutputStream("Demo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream("Demo.ser");
        ObjectInputStream ois  = new ObjectInputStream(fis);
        
        B obj2= (B)ois.readObject();

        System.out.println("name : "+obj2.name+" age : "+obj2.age+" univ : "+ obj2.univ);
        
    }    
}