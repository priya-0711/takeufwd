package org.example.multithreadingprograms;

class Printer implements Runnable {
    private boolean isOdd = true;

    public void run() {
        if(Thread.currentThread().getName().equals("odd")){
            for (int i = 1; i <= 10; i += 2) {
                printOdd(i);
            }
        } else  {
            for (int i = 2; i <= 10; i += 2) {
                printEven(i);
            }
        }

    }
    synchronized void printOdd ( int number) {
        while(!isOdd){
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("odd:"+ number); //1,3
        isOdd = false;
        notify();
        }


    synchronized void printEven (int number) {
        while(isOdd) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("even:"+number); //2,4
        isOdd=true;
        notify();

        }


}

public class InterThreadCommnPrintOddEven {
    public static void main(String[] args) {

        Printer printer = new Printer();
        Thread oddThread = new Thread(printer);
        oddThread.setName("odd");
        Thread evenThread = new Thread(printer);
        evenThread.setName("even");

        oddThread.start();
        evenThread.start();
    }
}
