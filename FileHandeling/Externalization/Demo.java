import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;

class Account implements Externalizable
{
    int accno;
    String name;
    int pin;

    /*
        It is imoprtant to have noargument constructor and it should be public 
    */
    public Account(){
        System.out.println("No argument Constructors");
    }

    public Account(int accno, String name, int pin){
        this.accno = accno;
        this.name= name;
        this.pin = pin;
    }

    /*
        - compulsory to have writeEternal and readExternal
        - they should be public
        - they define logic which data to be written and read from file
        - they are called automatically when ObjectOutputStream and ObjectInputStream 
            writeObject() and readObject() is called    
    */

    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeInt(accno);
        out.writeObject(name);
    }

    public void readExternal(ObjectInput ois) throws IOException, ClassNotFoundException
    {
        accno = ois.readInt();
        name = (String)ois.readObject();
    }
   
}
public class Demo {

    public static void main(String[] args) throws Exception{
        Account obj = new Account(30133,"Yash Khati",307);

        FileOutputStream fos = new FileOutputStream("demo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
    
    
        FileInputStream fis = new FileInputStream("demo.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account obj2 = (Account)ois.readObject();  
        
        System.out.println(obj2.accno+"\n"+obj2.name+"\n"+obj2.pin);
    }
}