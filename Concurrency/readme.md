# Concurrency Notes

* **Multitasking** : Executing multiple task simultaneously is called Multitasking
    - 2 Types of multitasking
        1. Process Based : Executing several tasks simultaneously where each task is a separate independent process is called Process based Multitasking.
        2. Thread Based : Executing several tasks simultaneously where each task is a separate independent part of the same program is called Thread based Multitasking

# Multithreading

* Multithreading in Java is a process of executing multiple threads simultaneously.

* **Threads** : A thread is a lightweight sub-process, the smallest unit of processing that can be managed by an operating system.

* Defining a Thread
    - We can define a thread in 2 ways
        -  By extending Thread Class.
        -  By implementing Runnable interface


### Extending Thread Class
 
```java
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
        public static void main(String[] args){
                    
            MyThread t = new MyThread(); // thread initialization

            t.start(); // thread start
            for(int i=0; i<100; i++){
                System.out.println("Main Thread");
            }
        }   
    }
```

* The output of above program cannot be guessed exactly as it depends on Thread Schedular. 

* run() -> It is method of thread class which originally has empty implementation.
    - We override it because run function where we define task performed by thread i.e JOB of thread.
    - If we call run directly it will be executed as normal instance method in current thread and not in new thread.

* start() -> It is method responsible for execution of new thread. 
    - It initiates thread execution ,and then jvm invokes run()
    - It also allow thred to scheduled for execution by thread scheduler. 
    - It can be invoked once per object. If we attempt to start a thread that has already been started, the JVM will throw an **IllegalThreadStateException**.
    - If we Overload run() then start() calls run method with no arguments.

### Implementing Runnable 

```java
    class MyThread implements Runnable{
    // Job of Thread
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Child Thread");
            }
        }
    }

    public class Demo1 {
        public static void main(String[] args) {
            MyThread r = new MyThread();
            Thread t = new Thread(r);
            t.start();
            for(int i=0; i<100; i++){
                System.out.println("Main Thread");
            }
        }
    }
```

### Synchronization

* ***Synchronization*** is the capability to control the access of multiple threads to any shared resource.

    * It is used to prevent 
        - Thread Interference
        - Inconsistency Problem          

* Synchronized keyword is applicable for bethods and blocks. 
* Every object in java has a unique lock. If a thread want to execute any synchronized method on the object first it should require the lock of that object. Once a thread got the lock then it is allowed to execute any synchronized method on that object.

    ```java
       
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
    ```
* While a thread executing a synchronized method on the object, then the remaining threads are not allowed to execute any synchronized method on the same object. But the remaining threads are allowed to execute any non-synchronized method on the same object.

    ```java
        class Test2{
        public synchronized void m1(){
            for(int i=0;i < 10; i++)
            {
                System.out.println("Called M1");
                try {
                    Thread.sleep(1000);    
                } catch (Exception e) {
                    System.out.println("Error : "+e);
                }
            }
        }

        public synchronized void m2(){
            for(int i=0;i < 10; i++)
            {
                System.out.println("Called M2");
                try {
                    Thread.sleep(1000);    
                } catch (Exception e) {
                    System.out.println("Error : "+e);
                }
            }
        }
    
        public void m3(){
            for(int i=0;i < 10; i++)
            {
                System.out.println("Called M3");
                try {
                    Thread.sleep(1000);    
                } catch (Exception e) {
                    System.out.println("Error : "+e);
                }
            }
        }
    }

        class MyThread2 implements Runnable{
            Test2 t;
            int method_num;
            public MyThread2(Test2 t, int method_num){
                this.t = t;
                this.method_num = method_num;
            }

            public void run(){
                if(method_num == 1){
                    t.m1();
                }
                else if(method_num == 2){
                    t.m2();
                }
                else{
                    t.m3();
                }
            }
        }

        public class Demo2 {

            public static void main(String[] args) {
                
                Test2 obj = new Test2();

                MyThread2 r1 = new MyThread2(obj,1);
                MyThread2 r2 = new MyThread2(obj,2);
                MyThread2 r3 = new MyThread2(obj,3);

                Thread t1 = new Thread(r1);
                Thread t2 = new Thread(r2);
                Thread t3 = new Thread(r3);
                
                t1.start();
                t2.start();
                t3.start();
            }
        }
    ```

* Each instance of a class has its own separate lock, meaning that synchronized methods in one instance do not affect the execution of synchronized methods in another instance. As a result, if you have multiple threads operating on different instances of the same class, the synchronized methods will not prevent concurrent access among those instances. This is because each thread is locking and operating on a different object
    ```java
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
    ```

* If the synchronized method is static then it will prevent concurrent access among instances i.e different objects and we will see synchronization among the instances.
    - Class level lock is obtained by thread which is used to coltrol access to static methods or blocks.
      
> [!NOTE]
> If have accquired class level lock and is running then no other thread can access synchronized static methods or synchronized static blocks of the class.
> If a thread having class level lock is running then second thread can run the object-level synchronized method even if the first thread is running a class-level synchronized method.

 ```java

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

  ```

* **Synchronized Block** : Synchronized Block allows you to synchronize only a portion of your code rather than the entire method. It provides more fine-tuned control over synchronization by allowing you to lock a specific object (or class) for only a critical section of code rather than locking the entire method.

*  Java provides two types of synchronization: instance-level synchronization and class-level synchronization.

    1. **Instance-Level Synchronization** : 
        - This synchronization is used to lock the instance of the class. Only one thread can execute code synchronized on the same instance at a time.
        - It’s useful when multiple threads are accessing the same instance of an object.

        - ```java
                    public void someMethod() {
                    synchronized(this) {
                    // critical section
                    }
                }
            ```
        - ```java
                /* synchronization for particular object */
                public void someMethod(Object obj){
                    synchronized(obj) {
                    // critical section
                    }
                }

            ```

    2. **Class-Level Synchronization**
        - This synchronization locks the class object rather than an instance. It ensures that only one thread can execute any of the synchronized static methods or blocks for that class.
        - It’s useful when threads are interacting with static variables or static methods.
        - ```java
                public static void someStaticMethod() {
                    synchronized(SomeClass.class) {
                        // critical section
                    }
                }
                
            ```








