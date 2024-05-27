package Opps.ClassObjects;

public class WrapperExamples
{
    public static void main(String[] args) {
        int a  = 20;

        var objA = Integer.valueOf(10);
        System.out.println(objA);

        objA=a;

        System.out.println(objA);


    }
}
