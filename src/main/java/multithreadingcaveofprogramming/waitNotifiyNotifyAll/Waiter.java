package multithreadingcaveofprogramming.waitNotifiyNotifyAll;

public class Waiter extends Thread {

    private Cup cup;

    public Waiter(Cup cup) {
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
            cup.pour();
        }
    }
}
