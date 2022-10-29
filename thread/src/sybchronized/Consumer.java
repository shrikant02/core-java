package sybchronized;

public class Consumer extends Thread{

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run(){
        while(true){
            synchronized (Main.bucket) { // decide which is out monitor
                if (!Main.bucket.isEmpty()) {
                    int n = Main.bucket.get(0);
                    Main.bucket.remove(0);
                    System.out.println(Thread.currentThread().getName() + " took out " + n + " from the bucket");
                }
            }
        }
    }
}

// one thread the has entered the block of code(acquired lock) no other thread are now allowed to enter the thread block of code
// until the execution is ended(released the lock) => we use synchronized keyword to do this

// Main.bucket is our monitor here
// because all the thread are interacting with it.
// if one thread is interacting with the Main.bucket another thread will wait for it to complete.
