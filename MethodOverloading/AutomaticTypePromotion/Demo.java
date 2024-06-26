
public class Demo {

    public void m1() {
        System.out.println("no-args");
    }

    public void m1(int i) {
        System.out.println("int-args");
    }

    public void m1(float f) {
        System.out.println("float-args");
    }

    public static void main(String[] args) {
        Demo t = new Demo();
        t.m1();
        t.m1(10);
        t.m1(10l);
        t.m1(10f);
        t.m1('a');
        // t.m1(10.5);
    }

}