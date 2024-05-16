import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D4_A implements Serializable{
    int a ;
    D4_A(int a){
        this.a = a;
    }
}
class D4_B implements Serializable{
    int b ;

    D4_B(int b){
        this.b = b;
    }
}
class D4_C implements Serializable{
    int c ;
    D4_C(int c){
        this.c = c;
    }
}

public class Demo4{
    
    public static void main(String[] args) throws Exception {
        
       D4_A obj1 = new D4_A(10);
       D4_B obj2 = new D4_B(20);
       D4_C obj3 = new D4_C(30);
       
       FileOutputStream fos = new FileOutputStream("abc4.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);

       oos.writeObject(obj1);
       oos.writeObject(obj2);
       oos.writeObject(obj3);

       
       FileInputStream fis = new FileInputStream("abc4.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       
       /*
        
            D4_C d3 = (D4_C)ois.readObject(); 
            D4_A d1 = (D4_A)ois.readObject();
            D4_B d2 = (D4_B)ois.readObject();
        
            Error java.lang.ClassCastException
        */
       D4_A d1 = (D4_A)ois.readObject();
       D4_B d2 = (D4_B)ois.readObject();
       D4_C d3 = (D4_C)ois.readObject();

       System.out.println(d1.a+" "+d2.b+" "+d3.c);
     }
}