class Demo2{
    public void m1(String s){
        System.out.println("String");
    }
    public void m1(Object s){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        
        Demo2 obj = new Demo2();
        obj.m1(new Object());
        obj.m1("Yash");
        obj.m1(null);

    }
    
}