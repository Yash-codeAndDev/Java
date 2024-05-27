package Opps.AccessControl.Inheritance;

public class A {

    public  int a;
    protected int b;
    int c;
    private int d;

    A(int a,int b,int c,int d){
        this.a =a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void show()
    {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
    }
}
