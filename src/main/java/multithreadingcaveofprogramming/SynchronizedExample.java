package multithreadingcaveofprogramming;

public class SynchronizedExample {

    /**
     * Don't need to mark count as volatile, because synchronized is used below.
     * Synchronize ensures that all values of count are seen by all threads at the same,
     * time, and volatile ensures that its not cached for performance reasons.
     *
     * Synchronised is already used, so volatile is no longer needed, because the state of
     * 'count' variable is not cached and it's state is access by all threads at the same time.
     *
     * Volatile guarantees that the variable state can be seen by all threads at the same time.
     *
     * Volatile ensures that all threads see the real current value of the shared variable,
     * and not some cached variable.
     * It stops threads creating their own cached version of the variable.
     * But it's not needed if you use synchronized.
     *
     */
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        synchronizedExample.doWork();

    }


    /**
     * Each object in the JVM has an intrinsic lock (mutex), which can be called
     * by one thread at any one time.
     *
     * The lock is release when the method execution is finished.
     *
     * If another thread tries to acquire the lock at the same time (by trying to increment) and call this method
     * then it has to wait, if the lock is already in use.
     *
     * Using synchronised ensures that the state of 'count' will be visible to all threads, all the time,
     * because it locks the objects prevents other threads running increment() and increasing count.
     *
     * It means that the method cannot be executed by two threads at the same time and the JVM takes care of enforcing that
     */
    public synchronized void increment() {
        count++;
    }

    public void doWork() throws InterruptedException {

        //both threads accessing same count variable at the same time
        //and so there is interleaving going on and values of count are being updated by both threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); //waits for thread to finish
        thread2.join();


        System.out.println("Value of count is: " + count);

    }
}
