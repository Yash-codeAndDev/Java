class MyThread3 extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Child Thread no parameters");
        }
    }
    public void run(int a){
        for(int i=0; i<100; i++){
            System.out.println("Child Thread no parameters");
        }
    }
}

public class ThreadDemo3 {

    public static void main(String[] args) {
                
        MyThread3 t = new MyThread3();
        t.start(); 
        // t.start();
        for(int i=0; i<100; i++){
            System.out.println("Main Thread");
        }
    }
    
}