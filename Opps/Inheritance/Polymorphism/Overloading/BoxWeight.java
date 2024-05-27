package Opps.Inheritance.Polymorphism.Overloading;

public class BoxWeight extends  Box {
    double weight;

    double val;
    BoxWeight(){
        super();
        System.out.println("In boxWeightClass");
        this.weight = -1;
        this.val = 15;
    }

    BoxWeight(double weight){
        super();
        this.weight = weight;
        this.val =15;
    }

    BoxWeight(double l,double b,double h ,double weight){
        super(l,b,h);
        this.weight = weight;

        this.val = 15;
    }

    public void area(){
        System.out.println("area() of BoxWeight");
        System.out.println(l*b*h*weight);
    }
}
