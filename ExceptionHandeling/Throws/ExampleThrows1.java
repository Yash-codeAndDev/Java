package ExceptionHandeling.Throws;

import java.io.IOException;

public class ExampleThrows1 {

    void m()throws IOException
    {
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException
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
        {
            System.out.println("exception handled");
        }
    }
    public static void main(String args[])
    {
        ExampleThrows1 obj=new ExampleThrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}
