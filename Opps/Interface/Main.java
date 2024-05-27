package Opps.Interface;

public class Main {
    public static void main(String[] args) {

        Car myCar  =new Car();

        myCar.acclerate();
        myCar.start();
        myCar.stop();

        Engine car = new Car();
        car.acclerate();
        car.stop();
//        car.a;

        Media carMedia  = new Car();
        carMedia.start();
    }
}
