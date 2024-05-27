package Opps.StaticInOops;

public class InnerClass3
{
    static class  B{
        static String name ;
        String name2;
        B(String name,String name2)
        {
            this.name = name;
            this.name2 = name2;
        }
    }
    public static void main(String[] args)
    {
        B ob1 = new B("Yash","Khati");
        B ob2 = new B("Rahul","Rana");

        System.out.println(ob1.name);
        System.out.println(ob2.name);

        System.out.println(ob1.name2);
        System.out.println(ob2.name2);
    }
}
