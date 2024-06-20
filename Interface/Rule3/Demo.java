interface A{
    void m1(); // by default abstract and public
    void m2();
}

public class Demo implements A {

    public void m1(){
        System.out.println("m1() defined");
    }
    
    public void m2(){
        System.out.println("m2() defined");
    }
    
    public static void main(String[] args) {
        System.out.println("Demo class");
        Demo obj = new Demo();
        obj.m1();
        obj.m2();
    }
}