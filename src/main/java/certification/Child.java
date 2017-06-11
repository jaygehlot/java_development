package certification;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/07/14
 * Time: 21:54
 * To change this template use File | Settings | File Templates.
 */
public class Child extends Parent {
    public static void main(String[] args) {
        Child c = new Child();
        c.testDefault();
    }

    public void testDefault(){
        Parent p = new Parent();
        System.out.println(p.x);

        System.out.println("Accessing default member in superclass" + x);
    }
}
