package pl.coderstrust.multiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Magazine {


    public static void main(String[] args) {


        BlockingQueue<Integer> magazine = new ArrayBlockingQueue(5);


        Producer producer = new Producer(magazine);
        Consumer consumer = new Consumer(magazine);

        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }

}

