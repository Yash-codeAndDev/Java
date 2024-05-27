package Opps.AccessControl.Inheritance;

public class C extends B {

    C(){
        super();
        System.out.println("C const. ");
    }
    void show(){
        System.out.println(" a : "+a);
        System.out.println(" b : "+b);
        System.out.println(" c : "+c);
    }
}
