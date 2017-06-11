package notcert;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/07/14
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class NeighbourOfChildOfOtherClass extends ChildOfOtherClass {
    public static void main(String[] args) {

    }

    public void testInheritedProtectedMember(){

        ChildOfOtherClass childOfOtherClass = new ChildOfOtherClass();
        //the following line won't work because once ChildOfOtherClass has inherited protected member x
        //you can't access it through object references in either this class or ChildOfOtherClass

        //childOfOtherClass.x;


        System.out.println(x);
    }
}
