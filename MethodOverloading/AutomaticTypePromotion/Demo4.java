
public class Demo4 {

    public void m1(int x) {
        System.out.println("General Method");
    }

    public void m1(int... x) {
        System.out.println("var-args");

    }
    public static void main(String[] args) {
        Demo4 t = new Demo4();
        t.m1(); // var-arg
        t.m1(10,20); // var-arg
        t.m1(10); // General
    }
}