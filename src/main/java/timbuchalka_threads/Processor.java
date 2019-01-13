package timbuchalka_threads;

import java.util.Scanner;

/**
 * Present a low-level mechanism for synchronising the behaviour
 * of your threads
 */
public class Processor {

    //both methods run in different threads


    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running");
            wait(); //can only run in synchronised code block
                    // hands over the lock that is held on this code block (relinquishes control of the lock)
                    //very resource efficient
                    //on the wait it loses control of the lock from this class
                    // it must be possible for this thread to regain control after the wait()

            System.out.println("Now I got the lock back, so I have Resumed control");
        }
    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Thread.sleep(2000);

        //IMPORTANT TO NOTE THAT THE CODE BLOCK IS SYNCHRONISED ON THE SAME OBJECT - i.e. the Processor class
        synchronized (this) {
            System.out.println("waiting for the return key");
            scanner.nextLine();
            System.out.println("Return key pressed");

            // notify() method does not actually relinquish control of the lock until after the current method has finished

            notify();///this can only be called within a sychronised code block
                        //will notify one other thread, which was the one that locked on the same object as this
                        //notify the other thread, that if its waiting it can wake up
                        //once the other thread (produce) method wakes up

            Thread.sleep(10000);  //the last sysout in the produce() method will only execute once this code
                                        // block finishes executing, even though notify() has told the other thread to wake up

        }
    }
}
