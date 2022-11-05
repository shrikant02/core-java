package main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example1 {

    public static void main(String[] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);

        Runnable r = () -> System.out.println(":)"); // ordering a pizza

        Future<?> future = service.submit(r); // order a pizza and get back a receipt

        // do lots of stuff(buy other things)

        try {
            System.out.println(future.get()); // get the pizza
            // if not ready -> we have to wait
            // ready -> returns the values
        } catch(InterruptedException e){

        } catch (ExecutionException e){
            // possible exceptions
            // pizza might be burnt
            // take a decision what you do
        } finally {
            service.shutdown();
        }
    }
}

// ExecutionException contain other possible exception that might happen during task execution i.e. from the inside the task
// we got exception
