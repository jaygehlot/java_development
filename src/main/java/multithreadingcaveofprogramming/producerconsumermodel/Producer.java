package multithreadingcaveofprogramming.producerconsumermodel;

public class Producer extends Thread {

    private Cup cup;
    private int number;

    public Producer(Cup c, int number) {
        this.cup = c;
        this.number = number;
    }

    public void run() {

        for(int i=0; i < 10; i++) {
            cup.put(i);
            System.out.println("Producer # " + this.number + " put " + i);

            try {
                sleep((long) (Math.random() * 200));
            } catch (InterruptedException e) {

            }
        }
    }
}
