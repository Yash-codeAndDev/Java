package Opps.AbstractClass;

abstract public class Parent
{
    int age;

    public Parent(int age) {
        this.age = age;
    }
//    abstract Parent(){
//
//    }

    static void greetings(){
        System.out.println("Hello from parent");
    }
    abstract   void  career();
    abstract  void partner();
}
