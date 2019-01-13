package multithreadingcaveofprogramming.producerconsumermodel;

/**
 * ConsumerThread tries to retrieve from the Cup 10 times
 */
public class Consumer extends Thread {
    private Cup cup;
    private int number;

    public Consumer(Cup c, int number) {
        cup = c;
        this.number = number;
    }

    public void run() {
        int value = 0;

        for (int i=0; i <10; i++) {

            //sleep added to make it easier to observe what is going on
            try {
                sleep((long) (Math.random() * 200));
            } catch (InterruptedException e) {

            }

            value = cup.get();
            System.out.println("Consumer # " + this.number + " got: " + value);
        }
    }
}
