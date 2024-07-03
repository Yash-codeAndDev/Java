# Overriding

* Feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a method in a subclass has the same name, return type, and parameters as a method in its superclass, the method in the subclass overrides the method in the superclass.

>[!Note]
>   * In Method Overriding Method Resolution is always based on Runtime object.
```java
    class A {
        public void m1(){
            System.out.println("A class m1()");
        }
    }
    class B extends A{
        public void m1(){
            System.out.println("B class m1()");
        }
    }

    public class Demo1 {

        public static void main(String[] args) {
            
            A a1 = new A();
            B b1 = new B();
            a1.m1(); // A class m1()
            b1.m1(); // B class m1() 

            A a2 = new B();
            a2.m1(); // B class m1()

            // B b2 = new A(); -> we cannot assign parent object to child class
            // b2.m1();
        }    
    }
```