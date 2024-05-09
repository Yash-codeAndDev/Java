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
> 3 Constructors of File Class

*1 