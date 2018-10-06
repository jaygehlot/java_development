package java8;

@FunctionalInterface
//this just has one single method
interface Executable {
    void executable();
}


class Runner {
    //want to pass a block of code to run
    public void run(Executable e) {
        System.out.println("Executing code block");
        e.executable();   //implementation of method is in the run block
    }
}

public class Lambdas {

    public static void main(String[] args) {

        Runner runner = new Runner();
        //pre - Java8
        runner.run(new Executable() {
            public void executable() {
                System.out.println("Hello there");
            }
        });


        System.out.println("===============");

        //() -> System.out.println("Hi")   -> this part is the lambda expression
        //lambda can have multiple blocks, but just a block of code that is passed to a function to execute
        // Always associated with an interface that has a single method

        runner.run(() -> {
            System.out.println("This code is passed in a Lambda expression");
            System.out.println("Hello there");
        });

    }
}
