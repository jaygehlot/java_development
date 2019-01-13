package multithreadingcaveofprogramming.waitNotifiyNotifyAll;

public class Customer extends Thread {

    private Cup cup;

    public Customer(Cup cup) {
        this.cup = cup;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public void run() {
        for(int i=1; i < 10; i++) {
            cup.drink();
        }
    }
}
