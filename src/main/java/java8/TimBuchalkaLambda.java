package java8;

public class TimBuchalkaLambda {

    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}
