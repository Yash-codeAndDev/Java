# Overriding

* Feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a method in a subclass has the same name and argument types and return type i.e (method signature must be same) as a method in its superclass, the method in the subclass overrides the method in the superclass.

>[!Note]
>   * In Method Overriding Method Resolution is always based on Runtime object. Therefore overriding is also known as Runtime/Dynamic Polymorphism or Late Binding
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

# Covarient Return Type

> [!Note]
> Method overriding requires that the overridden method in the subclass must have the same return type as the method in the superclass. However, Java allows a feature called covariant return types, which means the return type of the overriding method can be a subtype of the return type declared in the superclass method.
>   * Covarient Return Type is only Applicable for object type and not for primitives.

```java
    class P{
        public Object m1(){
            System.out.println("Parent");
            return null;
        } 
    }

    class C extends P{    
        public String m1(){
            System.out.println("Child");
            return null;
        }
    }

    public class Demo1 {
        public static void main(String[] args) {
            
            P a  = new P();
            a.m1(); // Parent
            
            C b = new C();
            b.m1(); // Child

            P a1 = new C();
            a1.m1(); // Child

            // C b1 = new P();
            // b1.m1();
        }
    }
```