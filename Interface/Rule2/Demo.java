interface A{
    void m1();
    void m2();
}
abstract class B implements A{
    public void m1(){
        System.out.println("m1() defined in Abstract class");
    }
}

public class Demo extends B{
 
    public void m2(){
        System.out.println("m2() defined in Demo ");
    }
    public static void main(String[] args) {
        System.out.println("Demo Called");
    }
}