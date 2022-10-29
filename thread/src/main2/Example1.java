package main2;

public class Example1 {
    public static void main(String[] args) {
        var r1 = new OddNumberRunnable(); //

        var t1 = new Thread(r1, "T1"); // NEW state
        var t2 = new Thread(r1, "T2"); // NEW state

        t1.start(); // RUNNABLE state
        t2.start(); // RUNNABLE state
        System.out.println("END! " + Thread.currentThread().getName());
    }
}
