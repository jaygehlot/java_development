package multithreadingcaveofprogramming.waitNotifiyNotifyAll;

/**
 * https://www.youtube.com/watch?v=VuahrRY0TgU - Colin Archibald
 */
public class Test {

    public static void main(String[] args) {

        //thread will take a lock on shared data - which is cup

        Cup cup = new Cup(0);  //this is the monitor object, which controls behaviour of the threads

        Waiter bob = new Waiter(cup);
        Customer steve = new Customer(cup);

        bob.start();
        steve.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n" + cup.getCoffee());
    }
}
