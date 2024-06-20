# Intraface

* 100% Abstract Class
* Cannot be Instantiated

## Important Points

1. Class implementing Intraface should provide definition to all the function derived from intraface. If we do not provide definition to all the methods we get Compile Time Error

```java
    interface Test {

        void m1();
        void m2();    
    }
    public class A implements Test {

        public void m1(){
            System.out.println("Provided Definition to m1()");
        }

        public void m2(){
            System.out.println("Provided Definition to m2()");    
        }

        public static void main(String[] args) {
            System.out.println(" Class A ");
        }
    }
```
```java
    interface Test {

        void m1();
        void m2();    
    }

    public class A implements Test {

        public void m1(){
            System.out.println("Provided Definition to m1()");
        }
        public static void main(String[] args) {
            System.out.println(" Class A ");
        }
    }
    /*
        Error
        A.java:8: error: A is not abstract and does not override abstract method m2() in Test
        public class A implements Test {
    */
```
2. If we dont want to provide definition to all functions we have to define the class as Abstract.
The Class extending Abstract will have to provide definition to functions which are not yet defined.
```java
    interface A{
        void m1();
        void m2();
    }
    abstract class B implements A{
        public void m1(){
            System.out.println("m1() defined in Abstract class");
        }
    }
    public class Demo extends B{
        public void m2(){
            System.out.println("m2() defined in Demo ");
        }
        public static void main(String[] args) {
            System.out.println("Demo Called");
        }
    } 
```