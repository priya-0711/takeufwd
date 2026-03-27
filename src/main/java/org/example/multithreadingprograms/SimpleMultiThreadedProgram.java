package org.example.multithreadingprograms;

class MyThread extends Thread {
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.print(i+" ");//executed by child thread
        }
    }
}
//programs to print mixed output parallely via 2 threads
public class SimpleMultiThreadedProgram {
    public static void main(String[] args) {
        MyThread t = new MyThread(); //main thread creates child thread
        t.start(); //main thread starts child thread
        for (int i=65;i<72;i++) {
            System.out.print((char)i+" "); //executed by Main Thread
        }
    }
}
