 import java.io.FileOutputStream;
 import java.io.FileInputStream;
 import java.io.IOException;
 import java.io.ObjectInputStream;
 import java.io.ObjectOutputStream;
 import java.io.Serializable;
 
 class A2{
     String name = "Yash";
     int age = 22;
 }
 
 class B2 extends A2 implements Serializable{
     int univ = 201317;
 }
 
 public class Demo2 {
 
     public static void main(String[] args) throws Exception {
         
         B2 obj = new B2();
         System.out.println("name : "+obj.name+" age : "+obj.age+" univ : "+ obj.univ);
         
         FileOutputStream fos = new FileOutputStream("Demo2.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(obj);
 
         FileInputStream fis = new FileInputStream("Demo2.ser");
         ObjectInputStream ois  = new ObjectInputStream(fis);
         
         B2 obj2= (B2)ois.readObject();
 
         System.out.println("name : "+obj2.name+" age : "+obj2.age+" univ : "+ obj2.univ);
     }    
 }