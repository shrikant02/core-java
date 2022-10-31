package volatyle;

public class PrintingThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(Main.b);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
