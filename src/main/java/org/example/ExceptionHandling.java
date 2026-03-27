package org.example;

import java.io.IOException;

class base {
    static int i =10;
    static{
        methodOne();
        System.out.println("base sttaic block");
    }

    public static void main(String[] args) {
        methodOne();
        System.out.println("base main");
    }
    public static void methodOne() {
        System.out.println(j);
    }
    static int j =20;
}
class derived extends base {
    static int x=100;
    static{
        methodTwo();
        System.out.println("derived first static block");
    }

    public static void main(String[] args) {
        methodTwo();

    }
    public static  void methodTwo(){
        System.out.println(y);
    }
    static{
        System.out.println("derived second sttaic block");
    }
    static int y=200;


}

