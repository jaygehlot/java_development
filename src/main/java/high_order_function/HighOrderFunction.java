package high_order_function;

/**
 * Based on https://www.youtube.com/watch?v=OcfTN1PZ7oA
 * High order functions - functions that take functions as data (so basically acceptance an interface)
 *
 * COULD INSTEAD USE JAVA 8 FUNCTION
 */
public class HighOrderFunction {

    public static int doTwice(IntUnaryFunction function, int x) {
        return function.apply(function.apply(x));
    }

    public static void main(String[] args) {
        TenX tenX = new TenX();

        System.out.println(doTwice(tenX, 2));
    }
}
