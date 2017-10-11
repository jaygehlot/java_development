package timbuchalka_threads;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");

            //terminates this thread - if you dont "return" then the last systout will be executed
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "6 seconds have passed and I'm awake");
    }
}
