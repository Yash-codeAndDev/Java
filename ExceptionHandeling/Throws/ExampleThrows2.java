package ExceptionHandeling.Throws;

import java.io.IOException;

public class ExampleThrows2 {
    void m() throws IOException
    {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {System.out.println("exception handeled");}
    }
    public static void main(String args[])
    {
        ExampleThrows2 obj=new ExampleThrows2();
        obj.p();
        System.out.println("normal flow");
    }
}
