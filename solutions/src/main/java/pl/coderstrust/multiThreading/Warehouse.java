package pl.coderstrust.multiThreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Warehouse {

    public static void main(String[] args) {

        Queue<Integer> warehouse = new LinkedList<>();
        int maxSize = 10;
        Producer producer = new Producer(warehouse, 10);
//        Consumer consumer = new Consumer(warehouse, 10);


        new Thread(producer).start();
//        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
        ExecutorService executorService = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 3; i++) {

            executorService.submit(new Consumer(warehouse, 10));
        }
    }
}