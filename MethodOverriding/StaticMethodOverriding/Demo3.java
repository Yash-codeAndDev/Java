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