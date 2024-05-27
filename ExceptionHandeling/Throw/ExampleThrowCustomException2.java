package ExceptionHandeling.Throw;

import java.util.Scanner;
class CustomException2 extends Exception{
    public CustomException2(String message){
        super(message);
    }
}
public class ExampleThrowCustomException2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        validateAge(age);
        System.out.println("Successful");

    }
    static void validateAge(int age){
        try {
            if (age  < 18){
                throw new CustomException2("Age less than 18");
            }
            else {
                System.out.println("Valid Age");
            }
        }catch (Exception E){
            System.out.println("Exception caught : "+E);
        }

    }

}
