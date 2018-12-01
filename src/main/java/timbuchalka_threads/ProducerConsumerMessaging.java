package timbuchalka_threads;

import java.util.Random;

public class ProducerConsumerMessaging {

    public static void main(String[] args) {
        Message message = new Message();

        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }
}

class Message {
    private String message;
    private boolean empty = true;

    //only one synchronized method can run at a time


    //DEADLOCK can happen here
    public synchronized String read() {
        while (empty) {
            try {
                wait();   //wait will solve the deadlock - we always call wait() in a loop
                            //so it checks the condition at the beginning of the loop
                            //releases its lock when the loop condition passes
            } catch (InterruptedException e) {

            }
        }
        empty = true;
        notifyAll(); //wakes up all threads waiting on this resource (watching this monitor)
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();     //wait will solve the deadlock
            } catch (InterruptedException e) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll(); //can't notify a specific thread
                        //conventional to use notifyAll()
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages [] = {
          "Jay",
          "Nidhi",
          "Ansh",
          "Gehlot"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                //sleep for 2 seconds after writing a message
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }

        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();

        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            System.out.println(latestMessage);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
    }
}
