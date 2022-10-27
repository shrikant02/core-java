package main;

public class EvenNumberThread extends Thread {

    @Override
    public void run() { // main method of out thread
        try {
        for(int i = 0; i <= 10; i+=2){
            System.out.println(i + " " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    // above instruction will run in parallel with other threads
}

// we have overridden run() to tell the thread what to do
