
interface Test {

    void m1();
    void m2();    
}

public class A implements Test {

    public void m1(){
        System.out.println("Provided Definition to m1()");
    }

    // public void m2(){
    //     System.out.println("Provided Definition to m2()");    
    // }

    public static void main(String[] args) {
        System.out.println(" Class A ");
    }
}