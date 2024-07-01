import java.util.*;
public class SampleClass {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new TC1(), "tc1");
		Thread t2 = new Thread(new TC2(), "tc2");
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Done with the entire work!");
	}
}

class TC1 extends Thread{
	public void run() {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = obj.nextInt();
		
		System.out.println(a);
		obj.close();

		System.out.println(Thread.currentThread().getName());

	}
}

class TC2 extends Thread{
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}