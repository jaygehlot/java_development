package multithreadingcaveofprogramming;

import java.util.Scanner;

class Processor extends Thread {

    //volatile prevent thread from caching the variable, if not changed within thread, if it caches then the thread runs forever
    private volatile boolean running = true;

    /**
     * The run method (thread) might not check outside of the thread to check if the value of
     * running has been changed.
     */
    public void run() {
        while (running) {
            System.out.println("Hello");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is outside of the run method, so its outside of the thread,
     * and what is in the thread (i.e. in the run method) might not check to
     * see if 'running' has been set to false. Volatile makes sure that running is
     * NOT cached into the JVM memory.
     */
    public void shutDown() {
        running = false;
    }
}

public class VolatileKeywordUsage {

    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.start();

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        processor.shutDown();

    }




}
