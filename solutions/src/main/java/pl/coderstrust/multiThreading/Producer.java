package pl.coderstrust.multiThreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue warehouse;

    public Producer(BlockingQueue warehouse) {
        this.warehouse = warehouse;
    }

    int counter = 0;
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced: " + counter);
                warehouse.put(counter);
                Thread.sleep(100);
                counter++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}