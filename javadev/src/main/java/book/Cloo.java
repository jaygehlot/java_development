package book;

import cert.Roo;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 31/05/14
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
public class Cloo extends Roo {
    public void testCloo(){
        this.doRooThings();
        doRooThings(); // call to doRooThings here is implicitly being accessed by this.doDoRooThings();
    }



    //void doRooThings(){

    //}   //this is not an overriding method
}
