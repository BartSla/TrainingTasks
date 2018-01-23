package pl.coderstrust.multiThreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue magazine;

    public Producer(BlockingQueue magazine) {
        this.magazine = magazine;
    }


    public void run() {
        while (true) {
            int i = 0;
            if (i <= magazine.size()) {

                try {
                    System.out.println("Produced: " + i);
                    magazine.put(i);
                    Thread.sleep(1000);
                   i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


