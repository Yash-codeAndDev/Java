package Opps.Inheritance.Polymorphism.Overloading;

public class Box {

    double l;
    double b;
    double h;
    double val;
    Box()
    {
        System.out.println("In Box Class ");
        this.l= -1;
        this.b = -1;
        this.h = -1;
        this.val =10;
    }
    Box(double l, double b, double h)
    {
        this.l= l;
        this.b = b;
        this.h = h;
        this.val = 10;
    }
    public void area (){
        System.out.println("In Box class Area()");
        System.out.println(l*b*h);
    }
}
