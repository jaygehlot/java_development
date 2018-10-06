package multithreadingcaveofprogramming;

class Runner extends Thread {

    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println("Hello" + i);
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FirstThread {

    public static void main(String[] args) {
        Runner runner = new Runner();
        //if you call run(), the code is run in the main thread, start() spawns off a new thread
        runner.start();


        Runner runner1 = new Runner();
        runner1.start();
    }
}
