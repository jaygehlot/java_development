package abstractclasses;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 12/11/14
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public class App {
    public static void main(String[] args) {
        Camera cam1 = new Camera();

        cam1.setId(5);

        System.out.println(cam1.getId());

        Car car1 = new Car();
        car1.setId(5);
        System.out.println(car1.getId());

        //Machine machine = new Machine();
          //cannot do this - cannot instantiate an abstract class

    }
}
