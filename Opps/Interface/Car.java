package Opps.Interface;

public class Car implements Engine,Brake,Media{

    int a = 20;
    @Override
    public void brake() {
        System.out.println("brake like a normal car");
    }

    @Override
    public void start() {

        System.out.println("start engine like a normal car");
    }

    @Override
    public void color() {
        System.out.println("Color");
    }

    @Override
    public void stop() {

        System.out.println("STOP engine like a normal car");
    }

    @Override
    public void acclerate() {
        System.out.println("Acclerate like a normal car");
    }
}
