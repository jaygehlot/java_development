package multithreadingcaveofprogramming;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CountDownProcessor implements Runnable {

    //not using synchronised class because this is threadsafe class
    private CountDownLatch latch;

    public CountDownProcessor(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // CountDownLatch will be counted down by one
        latch.countDown();
    }
}

public class CountDownLatches {

    public static void main(String[] args) {
        //threads wait can wait until count reaches 3 or zero
        CountDownLatch latch = new CountDownLatch(3);

        //this will create a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //each thread gets one Processor
        for(int i=0; i<3; i++)  {
            executorService.execute(new CountDownProcessor(latch));
        }

        try {
            latch.await();  //waits until CountDownLatch has counted down to zero
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("completed");

    }
}
