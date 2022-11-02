package main3;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        Thread t1 = new Thread(){
            public void run(){
                a.m1();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                a.m2();
            }
        };

        t2.start();
        t1.start();
    }
}
