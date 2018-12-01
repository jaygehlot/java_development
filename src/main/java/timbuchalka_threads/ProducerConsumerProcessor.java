package timbuchalka_threads;

import java.util.LinkedList;
import java.util.Random;

/**
 * Cave of Programming - https://www.youtube.com/watch?v=wm1O8EE0X8k&index=9&list=PLBB24CFB073F1048E
 */
public class ProducerConsumerProcessor {

    private LinkedList<Integer> linkedList = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    /**
     * Adds items to the linked list data store
     * @throws InterruptedException
     */
    public void produce() throws InterruptedException {

        int value = 0;

        while (true) {

            //code which access shared data - LinkedList - has to be inside the synchronised block
            synchronized (lock) {

                while (linkedList.size() == LIMIT) {
                    lock.wait();  //so basically, as long as the list is full, relinquish the lock and wait
                                    //this goes to sleep if the list is full, and lets go of control of the thread
                                    //this has been put into a loop, so that once the thread has been woken up
                                    //a check is made to see if the condition is now false
                }

                linkedList.add(value);  //java autoboxing here
                lock.notify(); //this wakes up the other thread, and tell it to stop waiting, it started waiting in the lock.wait()
                value++;
                Thread.sleep(3000);
            }



        }
    }

    /**
     * Removes items from data store from the front of the list, First In First Out
     * @throws InterruptedException
     */
    public void consume() throws InterruptedException {

        Random random = new Random();

        while (true) {

            while (linkedList.size() == 0 ) {
                lock.wait();  //if the list is empty, we want to give it a chance to fill up
                                //so apply the lock and let the other thread (produce method) run to fill it up
            }

            synchronized (lock) {
                System.out.print("List size is " + linkedList.size());
                int value = linkedList.removeFirst();
                System.out.println("; value is " + value);
                lock.notify();  //notify the thread above that it can now stop waiting and wake up
                                // it can add items to the LinkedList again
            }

            Thread.sleep(random.nextInt(3000)); //put thread to sleep for random amount of time
        }
    }
}
