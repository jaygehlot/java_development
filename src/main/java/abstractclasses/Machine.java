package abstractclasses;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 12/11/14
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */

/**
 * Want to ensure Machine class contains common code - so it can be made abstract
 */
public abstract class Machine {

    private int id;

    public int getId(){
       return id;
    }

    public void setId(int id){
        this.id = id;
    }

    //the child class HAVE TO implement these
    public abstract void start(); //let the child class worry about the implementation
    public abstract void doStuff(String stuffToDo); //let child class worry about implementation
    public abstract int shutDown(); //let child class worry about implementing this

    /**
     * The run method can call all of the abstract methods
     */
    public void run(){
        start();
        doStuff("stuff");
        shutDown();
    }
}
