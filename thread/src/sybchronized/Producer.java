package sybchronized;

import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            while (true) {
                synchronized (Main.bucket) {
                    if (Main.bucket.size() < 100) {
                        int n = r.nextInt(1000);
                        Main.bucket.add(n);
                        Main.bucket.notifyAll();
                        System.out.println(Thread.currentThread().getName() + " added " + n + " in the bucket");
                    } else {
                        Main.bucket.wait(); // producer now waits
                    }
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
// wait() and notify() are the methods to manage the Threads
// we can only call these methods inside synchronized block, or it will throw error
// we can only call these methods on monitor
// we can use them on any objects in java that's why they are implemented in Object class
