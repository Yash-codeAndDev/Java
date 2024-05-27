package Opps.AccessControl.Inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new A(2,3,4,5);
        a.show();

        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);

        C c = new C();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);

        System.out.println(c instanceof  A);

        System.out.println(c instanceof  B);

        System.out.println(c instanceof  C);

        System.out.println(c.getClass().getName());
        System.out.println(a.getClass());

    }
}
