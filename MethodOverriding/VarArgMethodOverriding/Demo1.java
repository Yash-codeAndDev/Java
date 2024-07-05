class P1{
    public void m1(int... x){
        System.out.println("parent");
    }
}
class C1 extends P1{
    public void m1(int x){
        System.out.println("child");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        
        P1 p = new P1();
        p.m1(10); // Parent

        C1 c = new C1();
        c.m1(30); // Child

        P1 obj = new C1();
        obj.m1(22); // Parent

    }
}
/*
    Method Overriding -> same method signature i.e same name and argument type bur argument type os different in above code therefore it is not method overriding but method overloading
*/

