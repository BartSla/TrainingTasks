package pl.coderstrust.multiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Warehouse {

    public static void main(String[] args) {

        BlockingQueue<Integer> warehouse = new ArrayBlockingQueue(5);

        Producer producer = new Producer(warehouse);
//        Consumer consumer = new Consumer(warehouse);


        new Thread(producer).start();
//        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 3; i++) {

            executorService.submit(new Consumer(warehouse));
        }
    }
}