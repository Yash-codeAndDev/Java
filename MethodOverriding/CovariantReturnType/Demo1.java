class P{
    public Object m1(){
        System.out.println("Parent");
        return null;
    } 
}

class C extends P{    
    public String m1(){
        System.out.println("Child");
        return null;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        
        P a  = new P();
        a.m1(); // Parent
        
        C b = new C();
        b.m1(); // Child

        P a1 = new C();
        a1.m1(); // Child

        // C b1 = new P();
        // b1.m1();
    }
}





