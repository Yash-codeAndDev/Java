package ExceptionHandeling.Throw;

import java.util.Scanner;

public class ExampleThrow2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        validateAge(age);
        System.out.println("Successful");

    }
    static void validateAge(int age){
       try {
           if(age < 18){
               throw new ArithmeticException("Age less than 18");
           }
           else{
               System.out.println("Age Greater than 18");
           }
       }catch (Exception e){
           System.out.println("Exception : "+e);
       }
       finally {
           System.out.println("fillaly exexuted");
       }
    }
}
