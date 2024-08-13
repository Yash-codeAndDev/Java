class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}

/**
 * Demo1
 */
public class Demo1 {
    public static void main(String[] args) {
        
        MyThread r1 = new MyThread();
        MyThread r2 = new MyThread();
        MyThread r3 = new MyThread();

        Thread t1 = new Thread(r1,"A");
        Thread t2 = new Thread(r2,"B");
        Thread t3 = new Thread(r3,"C");

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();

        for(int i=0; i<10; i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }

    }
}