package timbuchalka_threads;

import static timbuchalka_threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "1st in class " + "Hello from the main thread!");

        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("==== Another Thread ====");
        //always call start method to start off thread, not run
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "3rd in class Hello from the anonymous thread");
            }
        }.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from YET another thread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_RED + "4th in class Anonymous class implementation of run()");
                anotherThread.interrupt();
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_CYAN + "5th in class Hello again from main thread! I'm right at the end of the Main class");
    }
}
