package main2;

public class OddNumberRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=11; i+=2){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
// Runnable interface is used to create Tasks it is no Thread
// We can decide to execute this Task in same thread to different thread