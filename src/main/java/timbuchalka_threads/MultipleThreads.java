package timbuchalka_threads;

public class MultipleThreads {

    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        CountDownThread firstThread = new CountDownThread(countDown);
        firstThread.setName("THREAD1");

        CountDownThread secondThread = new CountDownThread(countDown);
        secondThread.setName("THREAD2");

        firstThread.start();
        secondThread.start();
    }

}

/**
 * Thread safe code - the area that thread interference can happen
 * in the class below has been synchronised, so the thread will lock
 * Don't want threads to be blocked or suspended un-necessarily, so
 * ONLY synchronise what is needed.
 */
class CountDown {

    private int i;

    //instance variables are stored on the HEAP, which means both threads access them, i.e. instance variables are shared
    //local variables (like in the for loop int i=0) are stored on each threads stack, so each thread has its own copy

    //with instance variables (we get thread interleaving, which leads to threads INTERFERENCE) - i.e two threads keep
    // interfering with each other
    // this is called the RACE CONDITION


    /**
     * Synchronized within the method to avoid thread interference and to stop the
     * race condition from happening
     *
     * Whole method runs, before another thread gets access to it.
     * No interleaving
     */
    public void doCountDown() {
        String colour;

        switch (Thread.currentThread().getName()) {
            case "THREAD1":
                colour = ThreadColor.ANSI_CYAN;
                break;

            case "THREAD2":
                colour = ThreadColor.ANSI_PURPLE;
                break;

            default:
                colour = ThreadColor.ANSI_GREEN;
        }

        //when synchronizing, we want to use an object that the threads will share, so they are both competing for the same lock
        //DON"T use local variables to synchronize - because each thread will be on its own thread stack, so no
        //competition for a resource

        //local variable references are stored on the thread stack, their values are stored on the heap
        //each thread creates its own reference, so there can be no thread interference
        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(colour + Thread.currentThread().getName() + ": i = " + i);
            }
        }

    }
}

class CountDownThread extends Thread {
    private CountDown threadCountDown;

    public CountDownThread(CountDown countDown) {
        threadCountDown = countDown;
    }

    public void run() {
        threadCountDown.doCountDown();
    }
}
