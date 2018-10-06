package completeablefuture;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

/**
 * https://www.callicoder.com/java-8-completablefuture-tutorial/
 */
public class CompletableFutureExamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //completableFutureExample();
        //runAsyncTask();
        runAsyncTaskAndReturn();
    }

    /**
     * CompletableFuture practice
     * @throws ExecutionException
     * @throws InterruptedException
     */
    static void completableFutureExample() throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        completableFuture.complete("Future's Result");

        //clients who want to get result of the completable future can call
        //the above call will block forever because the Future is never completed

        String result = completableFuture.get();

        assertEquals(result, "Future's Result");
    }


    /**
     * If you want to run some background task asynchronously and don’t want to return anything from the task
     * @throws ExecutionException
     * @throws InterruptedException
     */
    static void runAsyncTask() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulate a long-running Job
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");
        });

        future.get();
    }

    /**
     * If we want to return something from our CompletableFuture, after processing has been completed
     */
    static void runAsyncTaskAndReturn() throws ExecutionException, InterruptedException {
        // Run a task specified by a Supplier object asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation";
        });

    // Block and get the result of the Future
        String result = future.get();
        System.out.println(result);
    }
}
