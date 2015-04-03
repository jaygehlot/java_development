package accessmodifiers;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 19/07/14
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void testMethod1(){
        System.out.println("TM1");
    }
}

class Test2 extends Test{
    public static void testMethod1(){
        System.out.println("TM1");
    }
}
