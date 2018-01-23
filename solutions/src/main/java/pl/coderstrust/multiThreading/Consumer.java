package pl.coderstrust.multiThreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue warehouse;


    public Consumer(BlockingQueue warehouse) { this.warehouse = warehouse; }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + warehouse.take());
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}