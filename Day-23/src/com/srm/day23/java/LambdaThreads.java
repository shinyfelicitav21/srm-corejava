package com.srm.day23.java;

public class LambdaThreads {
	
public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": RunnableTest");

    Runnable r1 = new Runnable(){

      @Override
      public void run(){
        System.out.println(Thread.currentThread().getName() + " is running..");
      }
    };

    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + " is running.");
        }
    });

    Runnable r2 = () -> {
        System.out.println(Thread.currentThread().getName() + " is running");
    };

    Thread t1 = new Thread(r1);

    t1.start();
    t2.start();

    new Thread(r2).start();

}
}
