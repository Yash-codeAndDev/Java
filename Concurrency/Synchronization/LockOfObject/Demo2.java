class Test2{
    public synchronized void m1(){
        for(int i=0;i < 10; i++)
        {
            System.out.println("Called M1");
            try {
                Thread.sleep(1000);    
            } catch (Exception e) {
                System.out.println("Error : "+e);
            }
        }
    }

    public synchronized void m2(){
        for(int i=0;i < 10; i++)
        {
            System.out.println("Called M2");
            try {
                Thread.sleep(1000);    
            } catch (Exception e) {
                System.out.println("Error : "+e);
            }
        }
    }
 
    public void m3(){
        for(int i=0;i < 10; i++)
        {
            System.out.println("Called M3");
            try {
                Thread.sleep(1000);    
            } catch (Exception e) {
                System.out.println("Error : "+e);
            }
        }
    }
 
}

class MyThread2 implements Runnable{

    Test2 t;
    int method_num;
    public MyThread2(Test2 t, int method_num){
        this.t = t;
        this.method_num = method_num;
    }

    public void run(){
        if(method_num == 1){
            t.m1();
        }
        else if(method_num == 2){
            t.m2();
        }
        else{
            t.m3();
        }
    }
}

public class Demo2 {

    public static void main(String[] args) {
        
        Test2 obj = new Test2();

        MyThread2 r1 = new MyThread2(obj,1);
        MyThread2 r2 = new MyThread2(obj,2);
        MyThread2 r3 = new MyThread2(obj,3);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        
        t1.start();
        t2.start();
        t3.start();
        
        
    }
    
}