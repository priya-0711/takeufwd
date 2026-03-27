package org.example.multithreadingprograms;



class MyThread1 extends Thread {
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i);

        }
    }
}
public class YieldMethodExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread priority:"+Thread.currentThread().getPriority());
        MyThread1 t = new MyThread1();
        t.start();
       t.setPriority(7);
        System.out.println("child thread priority:"+t.getPriority());
        for(int i=65;i<72;i++) {
            Thread.yield();
            System.out.println((char)i);
        }
    }
}
