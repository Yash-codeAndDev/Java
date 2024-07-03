class Demo3{
    public void m1(String s){
        System.out.println("String");
    }
    public void m1(StringBuilder s){
        System.out.println("Object");
    }
    public static void main(String[] args) {
        
        Demo3 obj = new Demo3();
        obj.m1("Yash");
        obj.m1(new StringBuilder("Hello"));
        // obj.m1(null); //ambiguous as StringBuilder and String are both Child Class of Object class
    }
}