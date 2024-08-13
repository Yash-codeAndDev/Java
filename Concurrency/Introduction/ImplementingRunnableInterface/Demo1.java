class MyThread implements Runnable{
    
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Child Thread");
        }
    }
}


/**
 * Demo1
 */
public class Demo1 {

    public static void main(String[] args) {
        
        MyThread r = new MyThread();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<100; i++){
            System.out.println("Main Thread");
        }
    }
    
}