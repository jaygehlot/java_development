package multithreadingcaveofprogramming.producerconsumermodel;

/**
 * Producer - Consumer Pattern
 * This class needs to be thread safe, which means both methods need to be synchronised
 *
 */
public class Cup {
    private int contents;
    private boolean available = false;

    /**
     * The synchronised code controls the lock
     * The wait and notifyAll - control the co-ordination between threads
     * @return
     */
    public synchronized int get() {

        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        available = true;

        contents = value;

        notifyAll();
    }
}
