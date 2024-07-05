class P2{
    public void m1(){
    }
}
class C2 extends P2{
    public static void m1(){
    }
}
 /*
    error: m1() in C1 cannot override m1() in P1
    public void m1(){
                ^
    overridden method is static
*/