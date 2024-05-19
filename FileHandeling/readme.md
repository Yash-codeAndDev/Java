# File Handeling in Java

## 1. Introduction of java File Handeling

#### File Object
* File object is created to represent file or directory

>[!Note] 
> It does not create a file or directory

```java
    File f = new File('abc.txt')

    /*
        To check if file or directory exist of not 
        True if file exist and False if it does not
    */
    System.out.println(f.exist()); 

```
 * File object provides method createNewFile() to create new file
 * File object also provides method mkdir() to create a directory
 * if file does not exist it creates file and if it exists it does nothing

```java

    f.createNewFile();
    // f.mkdir()
```
- 3 Constructors of File Class
    1. Only One argument is passed
        - Creating File object to represent directory or file in given pathname  
        - Generally used to represent file in current working directory 
    ``` java
        /*
            File f = new File(String pathname);
        */
        String pathname = "abc";
        File f = new File(pathname);
    ```
    2. Two Arguments are Passed
        1. Type 1
            - Creating File object to represent directory or file in given sub-directory
            ``` java
                /*
                    File f = new File(String subdir,String filename);
                */

                File f = new File('subdirectory','abc.txt');
            ```
        2. Type 2
            - Creating File object to represent directory or file in another file object reference

            ``` java
            /*
                File f = new File(File f1,String filename);
            */
            File f1 = new File('fold1');

            File f = new File( f1 ,'abc.txt');
            ```

## FileWriter

* FileWriter : The FileWriter class in Java is used for writing character data to files. It is part of the Java I/O (Input/Output) classes and is specifically designed for writing text data to files.

* FileWriter Constructors
    1. File name is directly passed as arguments
        ```java
            /*
                FileWriter fw = new FileWriter(String filename)
            */
            String filename = 'abc.txt';
            FileWriter fw = new FileWriter(filename);
        ```
    2. File class object is passed as arguments
        ```java
            /*
                FileWriter fw = new FileWriter(File f)
            */
            String filename = 'abc.txt';
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
        ```
    3. File name and boolean value is passed signifying writing file in append mode if value is True else overwrites the file if value is False.
        ```java
            /*
                FileWriter fw = new FileWriter(String filename, boolean append)
            */
            String filename = 'abc.txt';
            FileWriter fw = new FileWriter(filename, true);
        ```
    4. File object and boolean value is passed signifying writing file in append mode if value is True else overwrites the file if value is False.
        ```java
            /*
                FileWriter fw = new FileWriter(File f, boolean append)
            */
            String filename = 'abc.txt';
            File f = new File(filename);
            FileWriter fw = new FileWriter(f, true);
        ```
> [!Note] 
>If specified file is not present these file will be created automatically



## FileReader

* The FileReader class in Java is used for reading character data from files. It is part of the Java I/O (Input/Output) library and is specifically designed for reading text files.

* FileReader Constructors
    1. File name is directly passed as arguments
        ```java
            /*
                FileReader fr= new FileReader(String filename)
            */
            String filename = 'abc.txt';
            FileReader fr = new FileReader(filename);
        ```
    2. File class object is passed as arguments
        ```java
            /*
                FileReader fr = new FileReader(File f)
            */
            String filename = 'abc.txt';
            File f = new File(filename);
            FileReader fr = new FileReader(f);
        ```
>[!Note]
> Limitations of FileReader and FileWriter:
> 1) We can only read data character by character and not line by line
> 2) While writing data we have to insert line separator manually which varies form system to system   

## BufferedWriter

* Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.
The buffer size may be specified, or the default size may be accepted

* Constructors :
    1) Only writer object is Passed
        ```java
            /*
                BufferedWriter(writer f)
            */

            File f = new File("abc.txt");

            FileWriter fw = new FileWriter(f)

            BufferedWriter bw = new BufferedWriter(fw);

        ```
    2) Writer object along with buffer size are Passed
    
        ```java
            /*
                BufferedWriter(writer f, int bufferSize)
            */
            FileWriter fw = new FileWriter('abc.txt')

            BufferedWriter bw = new BufferedWriter(fw);

        ```
> [!Note]
>    1) We cannot directly communitate or with files directly. It can commumicate via some  writer orbject only
>    2) If we want to open file in append mode just we just need to pass file writer object created in append mode 

*   ```java

        File f = new File("abc.txt",true);

        FileWriter fw = new FileWriter(f);

        BufferedWriter bw = new BufferedWriter(fw);
   
    ``` I


## BufferedReader

* Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line as well as character by character.

* Constructors :
    1) Only writer object is Passed
        ```java
            /*
                BufferedReader(Reader f)
            */

            File f = new File("abc.txt");

            FileReader fw = new FileReader(f)

            BufferedReader bw = new BufferedReader(fw);

        ```
    2) Writer object along with buffer size are Passed
    
        ```java
            /*
                BufferedReader(Reader f, int bufferSize)
            */
            File f = new File("abc.txt");

            FileReader fw = new FileReader(f)

            BufferedReader bw = new BufferedReader(fw, buffersize);

        ```
> [!Note]
>    1) We cannot directly communitate or with files directly. It can commumicate via some  reader object
>    2) In BufferWriter and FileWriter we cannot write any primitive data to write them we have to pass them in "" eg . bw.write("100") therefore to overcome this limitation PrintWriter class is used 

## Print Writer

* PrintWriter is a class used for writing character data to file.
* Main advantage of PrintWriter over BufferWriter and FileWriter is we can write any primitive data directly to file.


* Constructors :
    1) Directly write over file
        
        * Passing filename to PrintWriter object

        ```java

            /*
                PrintWriter pw = new PrintWriter(String filename)
            */

            PrintWriter pw = new PrintWriter("abc.txt")
        ```

        * Passing file object 
        
        ```java

            /*
                PrintWriter pw = new PrintWriter(File fobj)
            */
            File f = new File("abc.txt")
            PrintWriter pw = new PrintWriter(f)
        ```
    2) Write with help of Writer Object
    
        ```java
            /*
                PrintWriter pw = new PrintWriter(Writer wobj)
            */
            FileWriter fw = new FileWriter("abc.txt")
            PrintWriter pw = new PrintWriter(fw)
        ```
>[!Note]
> PrintWriter can directly communicate with file and can communicate via some writer object also


# Serialization

* Serialization in Java is a mechanism of writing the state of an object into a byte-stream. This mechanism serves to persist the object's state.
* The reverse operation of serialization is called deserialization where byte-stream is converted into an object
* To make a Java object serializable we implement the java.io.Serializable interface.
* For serializing the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization we call the readObject() method of ObjectInputStream class.

    ```java
                
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
            public static void main(String[] args) throws Exception
            {
                
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
    ```
* Preventing sensitive information (like password) to be written on file. To do this we make the object variable transient.Therefore default value of data is saved in file.

    ```java
        class UserDetails implements Serializable 
        {
    
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
    ```
>[!Note]
>   1) Static variable will not participate in serialization as it not part of object state and serialization is applicable of object.
>   2) Final variable is initialized at compile time therefore Final variable will participate in serialization directly by value . Hence declaring final variable as transient there is no impact.
>   3) We can serialize any number of objects in a file but during deserialization we have to deserialize them in same order.

```java
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
```
## Customized Serialization

* Transient fields are not serialized by default. If these fields need to be serialized in a custom manner (e.g., by applying encryption), you need to provide custom serialization logic.

* Customized serialization in Java is achieved by providing custom implementations of the writeObject and readObject methods within the class that implements Serializable. These methods allow you to define exactly how an object's state should be written to and read from the serialization stream.

```java
        
    class Account2 implements Serializable 
    {
        String username = "Yash Khati";
        transient String password = "Yash@123";
        transient int pin = 2233;
        transient int cvv = 221;

        private void writeObject(ObjectOutputStream os) throws Exception{
            os.defaultWriteObject();

            String encryptPassword = "123"+password;
            os.writeObject(encryptPassword);

            int epin = 105+ pin;
            os.writeInt(epin);
            
            int ecvv = 102+cvv;
            os.writeInt(ecvv);
        }
        private void readObject(ObjectInputStream is) throws Exception{
            is.defaultReadObject();
            String epswd = (String) is.readObject(); 
            password = epswd.substring(3); 

            int epin = is.readInt();
            pin = epin - 105;

            int dcvv = is.readInt();
            cvv = dcvv - 102;
        }
    }

    public class Demo2 
    {
        public static void main(String[] args) throws Exception {            
            Account2 obj = new Account2();
            System.out.println("Username : "+obj.username +"\t Password : "+obj.password+"\t Pin :"+obj.pin+"\t cvv :"+obj.cvv);

            FileOutputStream fos = new FileOutputStream("Demo2.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);


            FileInputStream fis = new FileInputStream("Demo2.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Account2 obj2 = (Account2)ois.readObject();

            System.out.println("Username : "+obj2.username +"\t Password "+obj2.password+"\t Pin : "+obj2.pin+"\t cvv :"+obj2.cvv);
        }    
    }
```

## Serialization in Inheritance

* If Parent class implements serializable and child class will automatically also implements serializable.

```java
    class A implements Serializable
    {
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
```