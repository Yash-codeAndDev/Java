package MethodOvriding.MethodHiding;

import javax.print.CancelablePrintJob;

class Parent {
    // Static method in base class
    // which will be hidden in subclass
    static void m1()
    {
        System.out.println("From parent "
                + "static m1()");
    }

    // Non-static method which will
    // be overridden in derived class
    void m2()
    {
        System.out.println(
                "From parent "
                        + "non - static(instance) m2() ");
    }
}

class Child extends Parent {
    // This method hides m1() in Parent
    static void m1()
    {
        System.out.println("From child static m1()");
    }

    // This method overrides m2() in Parent
    @Override public void m2()
    {
        System.out.println(
                "From child "
                        + "non - static(instance) m2() ");
    }
}

// Driver class
class Example1 {
    public static void main(String[] args)
    {
        Parent obj1 = new Child();
        obj1.m1();
        obj1.m2();

        Child obj2 = new Child();
        obj2.m1();
        obj2.m2();
    }
}