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
        Display disp1 = new Display();
        Display disp2 = new Display();
        MyThread r1 = new MyThread(disp1, "Dhoni");
        MyThread r2 = new MyThread(disp2, "Raina");
    
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
    
        t1.start();
        t2.start();
    }
     
}