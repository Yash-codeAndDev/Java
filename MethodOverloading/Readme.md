# Method Overloading


## Automatic Type Promotion
* While resolving overloaded methods  when the exact match for a method argument is not found, so Java promotes the argument type to a larger type that is capable of handling the value.
* Java automatically promote the argument types according to certain rules. The order of promotion is typically from smaller to larger data types 

>[!Note] 
> Promotion Order
>   * byte → short → int → long → float → double
>   * char → int
>   * If there is method overloading with arguments of method as String and Object and null is passed it is promoted to String. 

```java
public class Demo {
    public void m1() {
        System.out.println("no-args");
    }
    public void m1(int i) {
        System.out.println("int-args");
    }
    public void m1(float f) {
        System.out.println("float-args");
    }
    public static void main(String[] args) {
        Demo t = new Demo();
        t.m1(); // no-args
        t.m1(10); // int-args
        t.m1(10l); // float-args
        t.m1(10f); // float-args
        t.m1('a'); // int-args
        // t.m1(10.5); -> Error
    }
}
```
* In general various argument will get only executed when no other method matched only then var-arg method will run.
```java
public class Demo4 {
    public void m1(int x) {
        System.out.println("General Method");
    }
    public void m1(int... x) {
        System.out.println("var-args");

    }
    public static void main(String[] args) {
        Demo4 t = new Demo4();
        t.m1(); // var-arg
        t.m1(10,20); // var-arg
        t.m1(10); // General
    }
}
```
>   * Since Both StringBuilder and String are Child Class of Object class therefore in case of null we get compile time error
```java
class Demo3{
    public void m1(String s){
        System.out.println("String");
    }
    public void m1(StringBuilder s){
        System.out.println("Object");
    }
    public static void main(String[] args) {     
        Demo3 obj = new Demo3();
        obj.m1("Yash");
        obj.m1(new StringBuilder("Hello"));
        // obj.m1(null); //ambiguous as StringBuilder and String are both Child Class of Object class
    }
}
```

* In Method Overloading Method resolution is done by compiler based on Reference Type.

```java
    class Animal{
    }
    class Dog extends Animal{
    }

    public class Demo5
    {
        public void m1(Animal a){
            System.out.println("Animal");
        }
        public void m1(Dog d){
            System.out.println("Dog");
        }
        public static void main(String[] args) {        
            Demo5 t1 = new Demo5();
        
            Animal a = new Animal(); 
            t1.m1(a);   // Animal
            Dog d = new Dog();
            t1.m1(d); // Dog
            Animal obj = new Dog();
            t1.m1(obj); // Animal
        }
    }
```