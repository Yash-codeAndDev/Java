
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
        t.m1(); // no-args
        t.m1(10); // int-args
        t.m1(10l); // float-args
        t.m1(10f); // float-args
        t.m1('a'); // int-args
        // t.m1(10.5); -> Error
    }
}