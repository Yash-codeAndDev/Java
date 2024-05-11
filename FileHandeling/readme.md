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