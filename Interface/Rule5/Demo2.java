interface C {
    int a = 10;
}

interface D {
    float a = 20;
}

class Demo2 implements C,D{
   
    public static void main(String[] args) 
    {
        System.out.println("Demo2 implements A and B");
        // System.out.println(a); error
    }
}