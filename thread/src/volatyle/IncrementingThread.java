package volatyle;

public class IncrementingThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Main.b++;
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

