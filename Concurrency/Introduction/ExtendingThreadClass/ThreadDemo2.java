public class ThreadDemo2 {

    public static void main(String[] args) {
                
        MyThread t = new MyThread();
        t.run(); 
        /*  No new thread will be created and run acts as a normal thread
            method
        */
        for(int i=0; i<100; i++){
            System.out.println("Main Thread");
        }
    }
    
}