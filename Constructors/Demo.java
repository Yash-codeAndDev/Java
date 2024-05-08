class A
{
    static int a = 10;
    private static String d = "Private Static in A";
    int b;
    private int c ;

    A(){
        System.out.println("Constructor A called");
        this.b = 20;
        this.c = 30;
    }

    public void fun1(){
        System.out.println("Public Function in A");
        System.out.println("Accessing private variable of class A using fun1:\n c : "+ c + "\n d : " + A.d);
    }
    
    private void fun2(){
        System.out.println("Private Function in A");
    }
}

class B extends A{
    
    private int e;
    private static String f = "Private Static in B";
    B()
    {
        System.out.println("Constructor B called");
        this.e = 100;
    }
    
    public void display(){

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        // System.out.println("c : " + c);
        // System.out.println("d : " + B.d);
        // System.out.println("d : " + A.d);
        System.out.println("d : " + A.a);
        System.out.println("e : " + e); 
    }
}


public class Demo 
{
    public static void main(String[] args) {
        
        System.out.println("b = " + A.a );
        System.out.println("b = " + B.a );
        
        // System.out.println("b = " + A.d );
        // System.out.println("b = " + B.d );
        
        // System.out.println("f = : " + B.f);
        
        B obj = new B();
        // System.out.println("c : "+ obj.c);
        // System.out.println("e : "+ obj.e);

        obj.display();
        obj.fun1();
    }
}


