package pl.coderstrust.multiThreading;

import java.util.Queue;

public class Producer implements Runnable {

    private final Queue<Integer> warehouse;
    private int maxSize;

    public Producer(Queue<Integer> warehouse, int maxSize) {

        this.warehouse = warehouse;
        this.maxSize = maxSize;
    }

    int counter = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (warehouse) {
                try {
                    while (warehouse.size() == maxSize) {
                        System.out.println("Warehouse is full, "
                                + "Producer thread waiting for "
                                + "consumer to take something from warehouse");
                        warehouse.wait();
                    }
                    System.out.println("Produced: " + counter++);
                    warehouse.add(counter);
                    warehouse.notify();
                    Thread.sleep(100);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}