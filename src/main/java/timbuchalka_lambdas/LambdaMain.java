package timbuchalka_lambdas;

public class LambdaMain {
    public static void main(String[] args) {

        new Thread(new CodeToRun()).start();


        //OR using anonymous class

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from runnable .. instead main");
            }
        }).start();
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}