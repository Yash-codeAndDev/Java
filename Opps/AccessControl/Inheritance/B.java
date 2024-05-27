package Opps.AccessControl.Inheritance;

public class B extends A{


    B(){
        super(1,1,1,1);
        System.out.println("B constructor");
    }
    void show(){
        System.out.println(" a : "+ a);
        System.out.println(" a : "+ b);
        System.out.println(" a : "+ c);
//        System.out.println(" a : "+ d);
    }
}