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