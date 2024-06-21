# Intreface

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
    * Class implementing interface while defining these functions should make these functions visibility as public.
    * Interface Modifiers cannot be declared with modifiers like private, protected, static, synchronized , native, final, strictfp.

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
    * Interface variables cannot have modifiers like private, protected, volatile, transient.
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
5. We can implement multiple interface simultaneouusly using a class provided the implemented interfaces does not contains method of same signature but different return type.

```java
    interface A {
        void m1();
    }

    interface B {
        int m1();
    }

    class Demo implements A,B{

        public void m1(){
            System.out.println("Hello void m1()");
        }
        public int m1(){
            System.out.println("Hello int m1()");
            return 1;
        }
        public static void main(String[] args) 
        {
            System.out.println("Demo implements A and B");
        }
    }
    /*
        error: method m1() is already defined in class Demo
        public int m1(){
                ^
        error: Demo is not abstract and does not override abstract method m1() in B
        class Demo implements A,B{
        ^
        error: m1() in Demo cannot implement m1() in B
        public void m1(){
                    ^
        return type void is not compatible with int
    */
```
*   if the implemented interface have same method signature and same return  type no error occurs
```java
    interface A {
        void m1();
    }

    interface B {
        void m1();
    }

    class Demo implements A,B{

        public void m1(){
            System.out.println("Hello m1()");
        }
        
        public static void main(String[] args) 
        {
            System.out.println("Demo implements A and B");
        }
    }
``` 
* if we havae same variable name in implemented interfaces and we are not using it in the class which implements interfaces we will not get any error but if we use the variable we will get complie time error

```java
    interface C {
        int a = 10;
    }

    interface D {
        int a = 20;
    }

    class Demo2 implements C,D{
    
        public static void main(String[] args) 
        {
            System.out.println("Demo2 implements A and B");
            System.out.println(a); error
        }
    }
    /*
        error: reference to a is ambiguous
        System.out.println(a);
                           ^
        both variable a in C and variable a in D match
    */
```
6. We cannot have constructors inside interface.
```java
    interface A{
        A(){
            System.out.println("Interface Constructor");
        }
    }
    public class Demo {
        public static void main(String[] args) {
            System.out.println("Demo Class");   
        }
    }
    /*
        error: <identifier> expected
        A(){
        ^
    */
```