class Display2 {
    public static synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning : ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
            System.out.println(name);
        }
    }

}

class MyThread2 implements Runnable {
    Display2 obj;
    String name;

    MyThread2(Display2 d, String name) {
        this.obj = d;
        this.name = name;
    }

    public void run() {
        obj.wish(name);
    }
}

public class Demo4 {
    public static void main(String[] args) {
            Display2 disp1 = new Display2();
            Display2 disp2 = new Display2();
            Display2 disp3 = new Display2();
            
            MyThread2 r1 = new MyThread2(disp1, "Dhoni");
            MyThread2 r2 = new MyThread2(disp2, "Raina");
            MyThread2 r3 = new MyThread2(disp3, "Kholi");

            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);
            Thread t3 = new Thread(r3);
        
            t1.start();
            t2.start();
            t3.start();
        }
}
