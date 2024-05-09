# File Handeling in 

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
#### 3 Constructors of File Class
- Only One argument is passed
    - Creating File object to represent directory or file in given pathname  
    - Generally used to represent file in current working directory 
    ``` java
        /*
            File f = new File(String pathname);
        */
        String pathname = "abc";
        File f = new File(pathname);
    ```
- Two Arguments are Passed
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
    *Note:* If specified file is not present these file will be created automatically
    