package accessmodifiers;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 19/07/14
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 */

abstract class Vehicle{
    private String type;
    public abstract void goUpHill();
    public String getType(){
        return type;
    }
}

abstract class Car extends Vehicle{
    public abstract void putInReverse();

    public void goUpHill(){
        System.out.println("do stuff");
    }

    public void doCarThings(){

    }

}

public class Mini extends Car{
     public void putInReverse(){
        //putInReverse must be implemented because extending Car,
         //and this method is in Car
     }

   public void goUpHill(){
       //goUpHill must be implemented because extending Car, and Car extends Vehicle
        //and this method is in Vehicle
        //System.out.println("more stuff");
    }

    public void carThings(){
        goUpHill();
    }
}
