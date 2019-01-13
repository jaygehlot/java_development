package multithreadingcaveofprogramming.producerconsumermodel;

/**
 * Highlights the Producer-Consumer model for thread-safe thread co-ordination
 * Upon running this class, it can be seen that each number is added to the shared data store once
 * and consumed only once
 */
public class ProducerConsumerTest {

    public static void main(String[] args) {

        Cup cup = new Cup();  //this is the shared data object, which is where thread co-ordination will take place

        Producer producer = new Producer(cup, 1);
        Consumer consumer = new Consumer(cup, 1);
        Consumer consumer2 = new Consumer(cup, 2);

        producer.start();
        consumer.start();
        consumer2.start();
    }


}
