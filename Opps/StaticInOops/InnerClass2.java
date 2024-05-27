package Opps.StaticInOops;
class  A{
    String name2;
    static String name ;
    A(String name,String name2)
    {
        this.name = name;
        this.name2 = name2;
    }
}
public class InnerClass2
{
    public static void main(String[] args)
    {
        A ob1 = new A("Yash","Khati");
        A ob2 = new A("Rahul","Rana");

        System.out.println(ob1.name);
        System.out.println(ob2.name);

        System.out.println(ob1.name2);
        System.out.println(ob2.name2);
    }
}
