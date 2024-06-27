class X {
    public void m1(){
        System.out.println("X class m1()");
    }
    public float m2(){
        System.out.println("X class m2()");
    }
}
class Y extends X{
    public int m1(){
        System.out.println("Y class m1()");
        return 5;
    }
    public int m2(){
        System.out.println("Y class m2()");
        return 5;
    }
}

public class Demo2{

    public static void main(String[] args) {
        
        X x1 = new X();
        Y y1 = new Y();

        x1.m1();
        y1.m1();

    }    
}