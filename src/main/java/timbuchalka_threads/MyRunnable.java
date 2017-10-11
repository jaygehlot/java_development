package timbuchalka_threads;

import static timbuchalka_threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "in MyRunnable class Hello from MyRunnables's implementation of run()");
    }
}
