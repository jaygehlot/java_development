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

        //factor of 4 = 4*3*2*1

        System.out.println(factorial(4));
    }

    private static int factorial(int value) {
        System.out.println(value);

        //here method is being called within method - recursively
        //however this will give throw a stackoverflow exception because factorial is calling factorial which is calling factorial

        if (value == 1) {
            return 1; //breaks out of the code
        }

        return factorial(value - 1) * value;

        //an area exists in the jvm called the stack
        // stack is responsible for remembering local variables and which method called which method and storing this information
        // this information is used for recalling which method to go back to once the called method has been executed
        //stack is relatively small area which remembers local variables and function calls

        //all the values are getting stored on the stack whilst the factorial is being calculated

    }
}
