package innerclasses;


public class App {

    public static void main(String[] args) {
        Robot robot = new Robot(7);
        robot.start();

        // non static inner classes are where you want to group together functionality
        // and you need the instance variables to have access to the class
        //can create an instance of the inner class
        // using the following syntax and an existing instance of the Robot class
        Robot.Brain brain = robot.new Brain();
        brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
