class A3{
    public void m1(){
        System.out.println("Parent A3 m1()");
    }
    
    public void m2(){
        System.out.println("Parent A3 m2()");
    }
}


class B3 extends A3{
    public void m1(){
        System.out.println("Child B3 m1()");
    }
    
    public void m3(){
        System.out.println("Child B3 m3)");
    }
}
public class Demo3 {
    public static void main(String[] args) {
        
        A3 obj = new B3();
        obj.m1();
        obj.m2();
        // obj.m3();
    }    
}