package main;

import java.util.concurrent.*;

public class Example2 {
    public static void main(String[] args) {

        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);

        Callable<String> c = () -> "hello";

        Future<String> f = service.submit(c);

        try {
            String value = f.get();
            System.out.println(value);
        } catch (InterruptedException | ExecutionException e){
            // :(
        } finally {
            service.shutdown();
        }
    }
}
