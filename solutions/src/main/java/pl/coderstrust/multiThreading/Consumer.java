package pl.coderstrust.multiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

    private final BlockingQueue magazine;
    private int i = 0;

    public Consumer(BlockingQueue magazine) {
        this.magazine = magazine;
    }

    @Override
    public void run() {
        while (true) {
            if (magazine.size()>0)
            try {
                System.out.println("Consumed: " + magazine.take());
                Thread.sleep(2000);
                i--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
