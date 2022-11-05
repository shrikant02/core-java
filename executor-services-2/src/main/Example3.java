package main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example3 {

    public static void main(String[] args) {

        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);

        SummingTwoNumber c = new SummingTwoNumber(2,3);

        Future<Integer> future = service.submit(c);

        try {
            Integer i = future.get();
            System.out.println(i);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }finally {
            service.shutdown();
        }
    }
}
