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

3. Methods in interface are by default public and abstract.
    * Class implementing interface while defining these functions should make these functions visibility as public

```java
    interface A{
        void m1(); // by default abstract and public
        void m2();
    }
    public class Demo implements B {
        public void m1(){
            System.out.println("m1() defined");
        }
        public void m2(){
            System.out.println("m2() defined");
        }
        public static void main(String[] args) {
            System.out.println("Demo class");
            Demo obj = new Demo();
            obj.m1();
            obj.m2();
        }
    }
```

```java
    interface A{
        void m1(); // by default abstract and public
        void m2();
    }

    public class Demo implements A {

        public void m1(){
            System.out.println("m1() defined");
        }
        
        void m2(){
            System.out.println("m2() defined");
        }
        
        public static void main(String[] args) {
            System.out.println("Demo class");
            Demo obj = new Demo();
            obj.m1();
            obj.m2();
        }
    }
    /*
        error: m2() in Demo cannot implement m2() in A
        void m2(){
            ^
        attempting to assign weaker access privileges; was public
    */
```
4. Interface variable are by default public, static and final.
    * It is compulsory to initialize the variables in interface at time of declaration only.
```java
    interface A{
        int a ;
    }
    public class Demo implements A {
        public static void main(String[] args) {
            System.out.println("Demo class");
        }
    }
    /*
        error: = expected
        int a ;
            ^
    */
```
```java
    interface A{
    private int a = 10 ;
    }
    public class Demo implements A {
        public static void main(String[] args) {
            System.out.println("Demo class");
        }
    }
    /*
        error: modifier private not allowed here
        private int a = 10 ;
                    ^
    */
```
```java
    interface A{
        int a = 10 ; // by default public static final
    }

    public class Demo implements A {
        public static void main(String[] args) {
            System.out.println("Demo class");
            System.out.println(a);
            /*
            // a = 23; 
                error: cannot assign a value to final variable a
                a = 23;
                ^  
            */
        }
    }
```
