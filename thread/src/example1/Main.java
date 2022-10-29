package example1;

public class Main {
    public static void main(String[] args) {

        var db1 = new DB1Runnable();
        var db2 = new DB2Runnable();

        var t1 = new Thread(db1);
        var t2 = new Thread(db2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PROCESSING.....");
    }
}

// Synchronization => means controlling the execution of the threads in terms of controlling the way they execute one relative to another.
// join() => specifies that the current waits for the one from which we referred the join() method.
// join() will also throw exception because it is blocking the thread.
