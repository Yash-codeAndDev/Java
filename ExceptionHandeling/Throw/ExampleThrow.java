package ExceptionHandeling.Throw;

import java.util.Scanner;

public class ExampleThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        validateAge(age);
        System.out.println("Successful");

    }
    static void validateAge(int age){
        if(age < 18){
            throw  new ArithmeticException("Age less than 18");
        }
        else {
            System.out.println("Age Greater than 18");
        }
    }
}
