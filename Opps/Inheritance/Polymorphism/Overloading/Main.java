package Opps.Inheritance.Polymorphism.Overloading;

public class Main {
    public static void main(String[] args) {

        Box obj = new Box();
        obj.area();
        System.out.println("val using Box object and Box reference : "+obj.val);
        Box obj1 = new Box(2,3,4);
        obj.area();


        BoxWeight obj2 = new BoxWeight();
        obj2.area();

        System.out.println("val using BoxWeight object and BoxWeight reference : "+obj2.val);
        BoxWeight obj3 = new BoxWeight(2,3,4,5);
        obj2.area();

        Box obj4 = new BoxWeight(2,3,4,5);
        obj4.area();

        System.out.println("val using BoxWeight object and Box reference : "+obj4.val);

        //        System.out.println(obj4.weight);

//        BoxWeight obj5 = new Box();



    }
}
