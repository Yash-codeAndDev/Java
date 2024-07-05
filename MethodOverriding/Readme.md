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

## Covarient Return Type

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

## Rules

### Exceptions
* If Child class throw any checked exception the parent should also throw same checked exception or its parent exception.
* There are no rule for unchecked exceptions.
* Valid Method Overriding 

    1. - Parent: public void m1() throws Exception
       - Child : public void m1()

    2. - Parent: public void m1() throws Exception
       - Child : public void m1() throws IOException

    3. - Parent: public void m1() throws IOException
       - Child : public void m1() throws FileNotFoundException, EOFException

    4. - Parent: public void m1() throws IOException
       - Child : public void m1() throws ArithmeticException

* Invalid Method Overriding

    1. - Parent: public void m1() 
       - Child : public void m1() throws Exception

    2. - Parent: public void m1() throws IOException
       - Child : public void m1() throws Exception

    3. - Parent: public void m1() throws IOException
       - Child : public void m1() throws InterruptedException

### Static method
* We cannot override Static method as Non-Static.
```java
    class P1{
        public static void m1(){
        }
    }
    class C1 extends P1{
        public void m1(){
        }
    }
    /*
        error: m1() in C1 cannot override m1() in P1
        public void m1(){
                    ^
        overridden method is static
    */
```
* We cannot have overriden method static if overriden method is instance method i.e non static method.
```java
    class P2{
        public void m1(){
        }
    }
    class C2 extends P2{
        public static void m1(){
        }
    }
    /*
        m1() in C2 cannot override m1() in P2
            public static void m1(){
                            ^
        overriding method is static
    */
```
* If both Parent and Child class methods are static then we wont get any complie time error.
* It seems overriding concept is applicable for static method but it is not Overriding but it is Method Hiding.
```java
    class P3{
        public static void m1()
        {
            System.out.println("Parent");
        }
    }
    class C3 extends P3{
        public static void m1()
        {
            System.out.println("Child");
        }
    }

    public class Demo3{
        public static void main(String[] args) 
        {
            P3 obj1 = new P3();
            obj1.m1(); // Parent
            C3 obj2 = new C3();
            obj2.m1(); // Child        
            P3 obj = new C3();
            obj.m1(); // Parent
        }
    }
```

> [!Notes]
> Method Hiding : All properties of Method Hiding are same as Method Overriding.
>Difference between Method Overriding and Method Hiding is that In Method Hiding method resolution is taken care by compiler based on reference type but in Method Overriding method resolution is taken care by JVM based on Runtime Object