package ExceptionHandeling.Throw;

import java.util.Scanner;
//class CustomException extends Exception{
//    public CustomException(String message){
//        super(message);
//    }
//}
/*
for custom exception we have to declare throws in signature of method
 */
public class ExampleThrowException {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();


        if(age < 18){
            throw  new ArithmeticException("Exception ");
        }
        else {
            System.out.println("No exception");
        }
        System.out.println("Successful");

    }
}
