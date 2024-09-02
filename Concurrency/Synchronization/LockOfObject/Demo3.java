public class Demo3 {

    public static void main(String[] args) {
        Display disp1 = new Display();
        Display disp2 = new Display();
        Display disp3 = new Display();
        
        MyThread r1 = new MyThread(disp1, "Dhoni");
        MyThread r2 = new MyThread(disp2, "Raina");
        MyThread r3 = new MyThread(disp3, "Kholi");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
    
        t1.start();
        t2.start();
        t3.start();
    } 
     
}