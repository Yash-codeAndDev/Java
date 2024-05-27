package MethodOvriding.CovariantReturnType;

class A {
}

// Class 2
class B extends A {
}

// Class 3
// Helper class (Base class)
class Base {

    // Method of this class of class1 return type
    A fun()
    {
        // Display message only
        System.out.println("Base fun()");

        return new A();
    }
}

// Class 4
// Helper class extending above class
class Derived extends Base {

    // Method of this class of class1 return type
    B fun()
    {
        // Display message only
        System.out.println("Derived fun()");

        return new B();
    }
}

// Class 5
// Main class
public class Example1 {

    public static void main(String args[])
    {

        Base base = new Base();
        base.fun();
        Derived derived = new Derived();
        derived.fun();

        Base b = new Derived();
        b.fun();
    }
}
