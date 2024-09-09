class Display5{ 
    public synchronized void Displayc(){

        for(int i=65; i<=75; i++)
        {
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public synchronized void Displayn(){

        for(int i=65; i<=75; i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}

class Mythread5a extends Thread{
    Display5 d;
    Mythread5a(Display5 d){
        this.d = d;
    }
    public void run(){
        d.Displayc();
    }
}

class Mythread5b extends Thread{
    Display5 d;
    Mythread5b(Display5 d){
        this.d = d;
    }
    public void run(){
        d.Displayn();
    }
}

public class Demo5 {

    public static void main(String[] args) {
        
        Display5 obj = new Display5();

        Mythread5a t1 = new Mythread5a(obj);
        Mythread5b t2 = new Mythread5b(obj);
        t1.start();
        t2.start();
        
    }    
}