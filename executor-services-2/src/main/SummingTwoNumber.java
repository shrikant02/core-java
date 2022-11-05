package main;

import java.util.concurrent.Callable;

public class SummingTwoNumber implements Callable<Integer> {

    private int x, y;

    public SummingTwoNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() throws Exception {
        return x + y;
    }
}
