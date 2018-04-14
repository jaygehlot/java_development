package multithreading;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SimpleProcessor implements Runnable {

    private int id;

    public SimpleProcessor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting: " + id);

        //simulate doing a task like handling a web request
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed :" + id + "Thread will now start new task");
    }
}


public class ThreadPools {

    public static void main(String[] args) {

        //executorservice handles task management for each of its threads
        //starting 2 threads, once that thread has finished its work and is idle
        //it will start a new task
        //recycling threads in thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i=0; i<5; i++) {
            executor.submit(new SimpleProcessor(i));
        }

        //initiates shutdown of the ExecutorService. Waits for all existing tasks to
        // complete execution, accepts no new tasks
        //waits for all threads to complete doing what they are doing
        executor.shutdown();

        System.out.println("all tasks submitted");

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed");
    }
}
