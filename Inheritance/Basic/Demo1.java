class A{
    public void m1(){
        System.out.println("Parent");
    }
}
class B extends A
{
    public void m2()
    {
        System.out.println("Child");
    }
}

public class Demo1 {

    public static void main(String[] args) {
        
        A a =new A();
        a.m1();
        // a.m2(); -> child class properties are not available to parent
        
        B b = new B();
        b.m1();
        b.m2();

        A a2 = new B();
        a2.m1();
        // a1.m2();

        // B b2 =  new A();

    }
}