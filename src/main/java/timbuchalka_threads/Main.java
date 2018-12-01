package timbuchalka_threads;

import static timbuchalka_threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "1st in class " + "Hello from the main thread!");

        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("==== Another Thread ====");
        //always call start method to start off thread, not run
        //implement run method, but JVM calls it for us, we call start, because otherwise code will run on the main thread
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "3rd in class Hello from the anonymous thread")).start();

        new Thread(() -> System.out.println("Hello from YET another thread.")).start();  //using a lambda

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_RED + "4th in class Anonymous class implementation of run()");

                try {
                    anotherThread.join(); //joins the current thread, in this class to AnotherThread, once that terminates
                                            // comes back to this thread
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I was interrupted.");
                }

                //anotherThread.interrupt(); //calls the Interrupted exception in AnotherThread
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_CYAN + "5th in class Hello again from main thread! I'm right at the end of the Main class");
    }
}
