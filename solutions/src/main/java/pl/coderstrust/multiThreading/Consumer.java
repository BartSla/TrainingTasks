package pl.coderstrust.multiThreading;

import java.util.Queue;

public class Consumer implements Runnable {

    private final Queue<Integer> warehouse;
    private int maxSize;

    public Consumer(Queue<Integer> warehouse, int maxSize) {
        this.warehouse = warehouse;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (warehouse) {
                try {
                    while (warehouse.isEmpty()) {
                        System.out.println("Warehouse is empty,"
                                + "Consumer thread is waiting"
                                + " for producer thread to put something in warehouse");

                        warehouse.wait();
                    }
                    System.out.println("Consumed : " + warehouse.remove());
                    Thread.sleep(1500);
                    warehouse.notify();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}