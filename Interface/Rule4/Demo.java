interface A{
    int a = 10 ; // by default public static final
}

public class Demo implements A {
    public static void main(String[] args) {
        System.out.println("Demo class");
        System.out.println(a);
        /*
        // a = 23; 
            error: cannot assign a value to final variable a
            a = 23;
            ^  
        */
    }
}