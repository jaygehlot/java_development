package recursion;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 03/01/15
 * Time: 12:14
 * To change this template use File | Settings | File Templates.
 */
public class Recursion {

    public static void main(String[] args) {
        calculate(4);
    }

    private static void calculate(int i) {
        System.out.println(i);

        calculate(i);
    }
}
