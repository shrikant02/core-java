package main;

public class Example {
    // starting point of the main thread
    public static void main(String[] args) {
        EvenNumberThread t1 = new EvenNumberThread();
        t1.run();
        System.out.println("END!" + " " + Thread.currentThread().getName());
    }
}

// think of thread as a timeline i.e. it starts from time t0 and execute the set of instructions till time tn independently.
// main() only created single thread thus it is single threaded application
// in this topic we are discussing the threads created by us. // there are other threads also which are maintained by JVM.

// we can start the thread from main thread which will run independently // there is some between when we start the thread
// and when thread starts running // threads do not start immediately, it takes some time for actual implementation.

