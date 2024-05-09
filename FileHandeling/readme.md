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
 * if file does not exist it creates file and if it exists it does nothing

```java

    f.createNewFile();

```
> [!3 Constructors of File Class]
- Only One argument is passed
    - Creating File object to represent directory or file in given pathname  
    - generally used to represent file in current working directory 
    ``` java
        <!-- File f = new File(String pathname); -->
        String pathname = "abc";
        File f = new File(pathname);
    ```
- 2 Argument is Passed
    - Creating File object to represent directory or file in given  sub-directory
    - ``` java
        <!--File f = new File(String subdir,String filename);  -->
        File f = new File('subdirectory','abc.txt');
    ```