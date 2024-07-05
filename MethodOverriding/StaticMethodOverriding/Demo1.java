class P1{
    public static void m1(){
    }
}
class C1 extends P1{
    public void m1(){
    }
}
/*
    error: m1() in C1 cannot override m1() in P1
    public void m1(){
                ^
     overridden method is static
*/