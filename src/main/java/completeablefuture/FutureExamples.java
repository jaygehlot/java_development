package completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * https://dzone.com/articles/20-examples-of-using-javas-completablefuture
 *
 * https://github.com/manouti/completablefuture-examples
 */
public class FutureExamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        completedFutureExample();
    }

    /**
     * In this case the Future is also completed with a result i.e. "message
     *
     * The getNow(null) returns the result if completed (which is obviously the case),
     * but otherwise returns null (the argument)
     */
    static void completedFutureExample() throws ExecutionException, InterruptedException {
        CompletableFuture completeableFuture = CompletableFuture.completedFuture("message");
        assertTrue(completeableFuture.isDone());
        assertEquals("message", completeableFuture.get());

        System.out.println("All good!");
    }



}
