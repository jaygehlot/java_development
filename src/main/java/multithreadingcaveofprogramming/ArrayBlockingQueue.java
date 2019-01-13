package multithreadingcaveofprogramming;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueue {

    //thread safe - can access from multiple threads - do not have to worry about thread synchronisation
    private static BlockingQueue<Integer> blockingQueue = new java.util.concurrent.ArrayBlockingQueue<>(10);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        Thread producerThread = new Thread(() -> {
            try {
                producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }

    /**
     * A producer, which adds things to the Queue, in this case adds Integers
     * to the blockingQueue
     * The concept is that it is a Producer
     * @throws InterruptedException
     */
    private static void producer() throws InterruptedException {

        while (true) {
            //put() will patiently wait until items are removed from the queue, if it is full, before adding items to it
            //otherwise, normally will add items to it
            blockingQueue.put(random.nextInt(100));
        }
    }

    /**
     * No synchronisation needed here, as this is all taken care of in the ArrayBlockingQueue
     * @throws InterruptedException
     */
    private static void consumer() throws InterruptedException {

        while (true) {
            Thread.sleep(100);

            if(random.nextInt(10) == 0) {
                //if nothing is in the queue, take() waits until there is something in the queue, then takes it
                Integer value = blockingQueue.take();

                System.out.println("Taken value " + value + "; Queue size is " + blockingQueue.size());
            }
        }
    }
}
