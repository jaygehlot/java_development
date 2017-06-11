package notcert;

import certification.OtherClass;
/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 13/07/14
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class ChildOfOtherClass extends OtherClass {

    public static void main(String[] args) {
      new ChildOfOtherClass().printIt();
    }

    public void printIt(){
        System.out.println("adfd" + x);
    }
}
