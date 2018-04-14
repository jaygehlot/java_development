package multithreading;

/**
 * Andreas Haufler - https://www.youtube.com/watch?v=SC2jXxOPe5E
 *
 * Volatile usage - mainly to do with performance optimization
 *
 */
public class VolatileExample {

    //the value of running is cached (due to performance reasons) until its made volatile
    private static volatile boolean running = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {

            //wait for running to become true, so that this loop can be exited
            while (!running) { }

            System.out.println("Started");

            //wait for running to become false, so that this loop can be exited
            while(running) {}

            System.out.println("Stopped");

        }).start();


        Thread.sleep(1000);
        System.out.println("Starting");

        running = true;

        Thread.sleep(1000);
        System.out.println("Stopping");

        running = false;

    }

}
