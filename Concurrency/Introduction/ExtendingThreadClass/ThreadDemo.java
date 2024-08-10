// Thread Definition
class MyThread extends Thread{
    public void run(){
        // Job of Thread
        for(int i=0; i<100; i++){
            System.out.println("Child Thread");
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
                
        MyThread t = new MyThread(); // thread initialization

        t.start(); // thread start
        for(int i=0; i<100; i++){
            System.out.println("Main Thread");
        }
    }
    
}