package timbuchalka.threads;

import static timbuchalka.threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");

            //terminates this thread - if you dont "return" then the last systout will be executed
            return;
        }

        System.out.println(ANSI_BLUE + "6 seconds have passed and I'm awake");
    }
}
