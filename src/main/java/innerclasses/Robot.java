package innerclasses;

public class Robot {

    private int id;

    // Brain inner class is able to access instance data from the outer class
    //access modifier needs to be private or protected
    class Brain{
        public void think(){
            System.out.println("Robot " + id + " is thinking");
        }
    }

    //Battery class cannot access id, because id is non static
    //static inner classes are used for grouping functions and related items with the outer class
    public static class Battery{
        public void charge(){
            System.out.println("Battery charging....");
        }
    }

    public Robot(int id){
        this.id = id;
    }

    //this method could also return Brain, so inner classes can be returned
    public void start(){
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        final String name = "Jay";

        //inner class in method has the scope of ONLY the method
        //outside the method it cannot be called and has access to both
        //instance variables of the outer class and final method local variables

        class Temp{
            public void doSomething(){
                System.out.println("ID is " + id);
                System.out.println("Name is " + name);
            }
        }

        Temp t = new Temp();
        t.doSomething();

    }
}
