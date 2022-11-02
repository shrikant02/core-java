package sybchronized;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // these implementations of arraylist or set are synchronized
    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {
        Producer p1 = new Producer("p1");
        Producer p2 = new Producer("p2");
        Consumer c1 = new Consumer("c1");
        Consumer c2 = new Consumer("c2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
// zombie thread => which only runs but does nothing

/*
problem statement =>
if bucket is full Producer can't add values into it, and because of synchronized block other thread can't enter the block,
even Consumer(thus not creating memory for other values so that Producer can work) therefore our Producer will run infinitely
doing nothing as we have used while(true) in our logic.
Same goes for Consumer if bucket is empty, consumer doesn't have anything to consume and as it is synchronized block no other
thread can enter the block even Producer there it will run infinitely doing nothing as we have used while(true) in our logic.

solution =>
when bucket is full and Producer can't add values in it, we can make Producer to wait(block) and let other thread to run like
Consumer -> we can achieve this by calling wait() method on monitor in Producer
Same goes for Consumer when bucket is full, and it can't add values in it, we can make Consumer to wait(block) and let other
threads to run like Producer -> we can achieve this by calling wait() method on monitor in Consumer.

problem statement =>
now we need the start the blocked[wait()] threads again or will be stopped forever

solution =>
Producer -> just after adding the new element in the bucket we should notify all the waiting threads(Producer) so that
they start running again
Consumer -> just after removing the element from the bucket we should notify all the waiting threads(Consumer) so that
they start running again
We can achieve this using notify() and notifyAll()
notify() -> will notify the next thread waiting
notifyAll() -> will notify all waiting threads

in our case we don't if the next thread is Consumer or Producer we are calling notifyAll()
*  */