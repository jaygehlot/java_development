package polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 06/10/13
 * Time: 13:41
 * To change this template use File | Settings | File Templates.
 */
public class Tree extends Plant {

  @Override
  public void grow(){
    System.out.println("Tree is growing");
  }

  public void leavesShedding() {
    System.out.println("Leaves shedding");
  }
}
