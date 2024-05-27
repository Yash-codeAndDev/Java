package Opps.AbstractClass;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I want to be doctor");
    }
    @Override
    void partner(){
        System.out.println("I love captian america");
    }
}
