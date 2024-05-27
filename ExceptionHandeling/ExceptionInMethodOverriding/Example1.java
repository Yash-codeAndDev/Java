package ExceptionHandeling.ExceptionInMethodOverriding;

import java.io.IOException;

class ParentEx1{
    void msg(){
        System.out.println("Parent");
    }
}
public class Example1 extends ParentEx1 {

    /*

    error :
    void msg()throws IOException {
        System.out.println("Child");
    }

    */
    /*
        the below code works fine because we can declare unchecked exception

        void msg()throws RuntimeException{
            System.out.println("Child");
        }

     */
    public static void main(String[] args) {
        ParentEx1 p = new Example1();
        p.msg();
    }
}
