package Opps.AbstractClass;

public class Main {
    public static void main(String[] args) {

        Son obj = new Son(30);
        obj.career();
        obj.partner();

        Daughter obj1 = new Daughter(27);
        obj1.career();
        obj1.partner();

//        Parent obj2 = new Parent(20);

        Parent obj2 = new Son(17);
        obj2.career();

        Parent.greetings();

    }
}
