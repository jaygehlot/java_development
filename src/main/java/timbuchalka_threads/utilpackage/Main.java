package timbuchalka_threads.utilpackage;

import timbuchalka_threads.ThreadColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static timbuchalka_threads.utilpackage.Main.EOF;

public class Main {
    //If thread is suspended, it cannot proceed in any way. It has to wait for the other threads to finish
    // to gain the lock on the object

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        //The arraylist is not synchronised, it is not thread safe, it is shared data and therefore needs to be synchronised
        List<String> buffer = new ArrayList<>();   //remember that ArrayList isn't Thread safe (meaning its classes are not thread safe)
                                                    //if a thread calls a method in the class, no other thread can access methods until that
                                                    //thread has finished executing methods
                                                    // if Class X has 3 methods, A, B, C and all are synchronised, and A is being executed
                                                    // B and C cannot be executed by other threads


        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();


    }
}

class MyProducer implements Runnable {

    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }


    /**
     * Without synchronising there are problems that can happen
     * with threads removing data from the shared Arraylist buffer and
     * then getting an IndexOutOfBounds exception
     *
     * or if both Consumers try to remove the same string
     *
     * Basically if we don't synchronise, there will be thread interference
     */
    @Override
    public void run() {
        Random random = new Random();

        String[] nums = {"1", "2", "3", "4", "5"};

        for(String num: nums) {
            System.out.println(color + "Adding..." + num);
            synchronized (buffer) {
                buffer.add(num);    //synchronise the arraylist, since its shared data
            }

            try {
                //as we sleep here, the consumer threads have an opportunity to remove
                //items from the list
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }

        }

        System.out.println("Adding EOF and exiting....");

        //this to ensure that the buffer doesn't change whilst the Producer is adding to it
        //so that the integrity of the arraylist isn't comprised
        synchronized (buffer) {
            buffer.add("EOF");
        }
    }
}


class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyConsumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        //normally would have the consumer sleep for a while before checking the buffer again
        //or use the notify(), wait() to promote inter thread communication
        while (true) {
            synchronized (buffer) {
                if(buffer.isEmpty()) {
                    continue;
                }

                if(buffer.get(0).equals(EOF)) {
                    System.out.println("Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed" + buffer.remove(0));
                }
            }

        }
    }
}
