class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            Thread.yield();
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        
        MyThread r1 = new MyThread();
        MyThread r2 = new MyThread();
        
        Thread t1 = new Thread(r1,"A");
        Thread t2 = new Thread(r2,"B");
        
        t1.setPriority(9);
        t2.setPriority(7);
        
        t1.start();
        t2.start();
        
        for(int i=0; i<10; i++){
            System.out.println(i+" "+Thread.currentThread().getName());   
        }
    }
}