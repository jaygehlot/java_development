package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * To demonstrate problems you could have when accessing
 * shared data from multiple threads
 *
 * REMEMBER THAT THERE IS ONLY ONE INTRINSIC LOCK PER OBJECT/CLASS
 *
 * Processing takes roughly 2 seconds because 2 threads are running
 * at the same time, as we can lock on the intrinsic lock, for 2 objects
 * and not rely on one
 */
public class MultipleLocks {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    //if this method gets an intrinsic lock on it from one thread
    //that lock will be for the whole object, which means it can't
    //execute stageTwo() until the lock on stageOne() has been released
    //THERE IS ONLY ONE INTRINSIC LOCK TO BE USED AT ANY ONE TIME
    /**
     * No two threads can run this method at the same time, because
     * intrinsic lock is taken out on the lock1 object, so
     * the method below can run, but for a different thread, which has taken out
     * the intrinsic lock on lock2 object
     */
    public void stageOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list1.add(random.nextInt(100));
        }
    }

    //making method synchronized puts intrinsic lock on whole object/class
    //2nd thread has to wait, to acquire the lock, until the 1st thread
    // is finished executing the code, so synchronising method might not be
    // good idea
    public void stageTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list2.add(random.nextInt(100));
        }
    }

    public void process() {
        for(int i=0; i< 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void main() {
        long start = System.currentTimeMillis();

        // two threads runnings in parallel
        //but accessing shared data in both threadS
        Thread firstThread = new Thread(this::process);

        Thread secondThread = new Thread(this::process);

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start));

        System.out.println("List 1: " + list1.size());
        System.out.println("List 2: " + list2.size());

    }

}
