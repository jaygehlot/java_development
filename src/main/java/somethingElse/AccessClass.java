package somethingElse;

import certification.OtherClass;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 31/05/14
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 */
public class AccessClass {
    static public void main(String[] args){
        OtherClass o = new OtherClass();
        //o.testIt();  //cannot access testIt since this is default (i.e. only package level)
                    //and sits in another package
    }
}
