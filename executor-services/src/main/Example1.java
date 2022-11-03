package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

    public static void main(String[] args) {
        ExecutorService service = null;  // pool
        try {
            int n = Runtime.getRuntime().availableProcessors();
            service = Executors.newFixedThreadPool(n);  // threads

            Runnable r = () -> {
                System.out.println(":) " + Thread.currentThread().getName()); // ball
            };
            service.execute(r); // throw balls in the pool

            System.out.println(":( " + Thread.currentThread().getName());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}

// shutdown() => will wait for all the Threads to execute and then shut the service
// shutdownNow() => will shut the service immediately and remaining threads will be closed.
