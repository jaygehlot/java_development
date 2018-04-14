package multithreading;

public class ThreadRunnable {

    /**
     * Running using a Lambda expression in new Thread
     * without implementing Runnable or extending a Thread
     * @param args
     */
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i=0; i < 10; i++) {
                System.out.println("Hello" + i);
            }
            System.out.println("Inside Thread"+Thread.currentThread().getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside Thread"+Thread.currentThread().getId());
        }).start();

        System.out.println("Outside thread, in main thread" + Thread.currentThread().getId());
    }
}
