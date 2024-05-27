package Opps.ClassObjects;

class  A{
    private A(){

    }

    private static A instance;
    public static A getInstance(){
        if(instance == null){
            instance = new A();
        }
        return  instance;
    }

}

public class SingletonClass {
    public static void main(String[] args) {
//        A obj = new A();

        A obj = A.getInstance();
        System.out.println(obj);

        A ob2 = A.getInstance();
        System.out.println(ob2);
    }
}
