package Opps.ClassObjects;

public class FinalKeyword
{
    public static void main(String[] args) {
        final int a = 10;
//        a = 20;

        finalizeClass obj;
        for (int i = 0;i<1000000;i++)
        {
            obj = new finalizeClass("obj"+i);
            System.out.println();
        }
    }
}

class finalizeClass{
    final  int num = 10;
    String name;

    public finalizeClass(String name)
    {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " object is destroyed");
    }
}