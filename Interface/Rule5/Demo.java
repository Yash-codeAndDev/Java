interface A {
    void m1();
}

interface B {
    void m1();
    // int m1(); 
}

class Demo implements A,B{

    public void m1(){
        System.out.println("Hello m1()");
    }
    // public int m1(){
    //     System.out.println("Hello int m1()");
    //     return 1;
    // }
    public static void main(String[] args) 
    {
        System.out.println("Demo implements A and B");
    }
}