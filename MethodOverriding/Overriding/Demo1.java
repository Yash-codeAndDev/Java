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

        A a2 = new B();
        // B b2 = new A();

        a1.m1();
        b1.m1();
        a2.m1();
        // b2.m1();
    }    
}