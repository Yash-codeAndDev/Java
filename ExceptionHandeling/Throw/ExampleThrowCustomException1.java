package ExceptionHandeling.Throw;

import java.util.Scanner;
class CustomException1 extends Exception{
    public CustomException1(String message){
        super(message);
    }
}
public class ExampleThrowCustomException1 {
    public static void main(String[] args) throws CustomException1 {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        validateAge(age);
        System.out.println("Successful");

    }
    static void validateAge(int age) throws CustomException1 {
        if(age < 18){
            throw  new CustomException1("Age less than 18");
        }
        else {
            System.out.println("Age Greater than 18");
        }
    }
}
