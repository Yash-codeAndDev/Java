class Display{
    public synchronized void wish(String name){
        for(int i=0; i<10; i++){
            System.out.print("Good Morning : ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Error "+e);
            }
            System.out.println(name);
        }
    }
}

class MyThread implements Runnable{
    Display obj;
    String name;

    MyThread(Display d , String name){
        this.obj = d;
        this.name = name;
    }

    public void run(){
        obj.wish(name);
    }
}

public class Demo1 {

    public static void main(String[] args) {
        Display disp = new Display();
        MyThread r1 = new MyThread(disp, "Dhoni");
        MyThread r2 = new MyThread(disp, "Raina");
        MyThread r3 = new MyThread(disp, "Kholi");
        MyThread r4 = new MyThread(disp, "Rohit");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    } 
     
}