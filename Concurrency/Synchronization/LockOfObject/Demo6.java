class Display6
{ 
    public static synchronized void dispNum(){
        for(int i=65; i<75; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    } 
    public synchronized  void displayGreet(){
        for(int i=65; i<75; i++){
            System.out.println(Thread.currentThread().getName() +" Greet : " + i );
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


class Mythread6a extends Thread{
    Display6 d;
    Mythread6a(Display6 d){
        this.d = d;
    }
    public void run(){
        d.dispNum();
    }
}

class Mythread6b extends Thread{
    Display6 d;
    Mythread6b(Display6 d){
        this.d = d;
    }
    public void run(){
        d.displayGreet();
    }
}

public class Demo6 {
    public static void main(String[] args) 
    {
        
        Display6 obj = new Display6();

        Mythread6a t1 = new Mythread6a(obj);
        Mythread6a t2 = new Mythread6a(obj);
        Mythread6a t3 = new Mythread6a(obj);
        Mythread6b t4 = new Mythread6b(obj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }   
}