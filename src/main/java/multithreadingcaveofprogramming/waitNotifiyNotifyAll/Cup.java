package multithreadingcaveofprogramming.waitNotifiyNotifyAll;

/**
 * This is the piece of shared data that need to be Thread safe and
 * therefore be synchronised
 * This object is Thread safe
 */
public class Cup {
    private int coffee;

    public Cup(int coffee) {
        this.coffee = coffee;
    }

    public synchronized int getCoffee() {
        return coffee;
    }

    public synchronized void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    /**
     * Waiter will have lock on the object; it has the lock on the cup, when inside the synchronised code
     * BUT - only one method can use the lock at a time.
     * If this method has the lock, no other method in the class can access any other synchronised block
     */
    public synchronized void pour() {
        int localCoffee = coffee;

        localCoffee++;
        System.out.println("Pour");

        try {
            Thread.sleep((long) (100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        coffee = localCoffee;
    }

    /**
     * Customer will have lock on the object; it has the lock on the cup, when inside the synchronised code
     * Synchronizing prevents the instance variable (coffee) from being corrupted
     */
    public synchronized void drink() {
        int localCoffee = coffee;

        localCoffee--;
        System.out.println("Sip");

        try {
            Thread.sleep((long) (100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        coffee = localCoffee;
    }
}
