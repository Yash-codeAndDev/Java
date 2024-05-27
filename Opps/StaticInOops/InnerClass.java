package Opps.StaticInOops;

public class InnerClass {

    class  A{
        String name ;
        A(String name)
        {
            this.name = name;
        }
    }

    static  class  B{
        String name ;
        static String name2;
        B(String name,String name2)
        {
            this.name = name;
            this.name2 = name2;
        }

    }
    public static void main(String[] args) {

        /*
            error because if inner class is not static
            we cannot access it from static method
            error =>StaticConcepts.InnerClass.this' cannot be referenced from a static context
         */
//        A obj1 = new A("Yash");
//        A obj2 = new A("Ayush");

            B bObj1 = new B("Yash","Khati");
            B bObj2 = new B("Rahul","Rana");

        System.out.println("bObj1.name = "+bObj1.name);
        System.out.println("bObj2.name = "+bObj2.name);
        System.out.println("bObj1.name2 = "+bObj1.name2);
        System.out.println("bObj2.name2 = "+bObj2.name2);

    }

}
