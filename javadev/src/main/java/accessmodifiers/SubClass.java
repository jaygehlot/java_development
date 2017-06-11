package accessmodifiers;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 19/07/14
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class SubClass extends SuperClass {
    //the below method overriding is not possible since this is marked
    // as final in the parent class

    //public void showSample(){

    //}


    private void finalMethodExample(final int i){

        //cannot do this since i is final in the method argument
        //i++;
    }
}
