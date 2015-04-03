package certification;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/07/14
 * Time: 21:58
 * To change this template use File | Settings | File Templates.
 */
public class SubClassOfChild extends Child {

    //testing out default access
    public void testAgain(){
        Child c = new Child();
        System.out.println(c.x);

        System.out.println(x);
    }
}
