package timbuchalka_threads;

public class AnotherProcessor {

    public static void main(String[] args) {

        final ProducerConsumerProcessor processor = new ProducerConsumerProcessor();

        Thread thread1 = new Thread(() -> {

            try {
                processor.produce();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread thread2 = new Thread(() -> {

            try {
                processor.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        thread1.start();
        thread2.start();

        //thread1.join();
        //thread2.join();
    }
}
