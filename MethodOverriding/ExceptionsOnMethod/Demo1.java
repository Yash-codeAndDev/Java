import java.io.*;

class P1{
    public void m1() throws IOException{

    }
}

class C1 extends P1 
{
    public void m1() throws RuntimeException{

    }
}


/*
class C1 extends P1 
{
    public void m1() throws Exception{

    }
}
 */

/* 
class C1 extends P1 
{
    public void m1() throws ClassNotFoundException{
    }
}
*/
