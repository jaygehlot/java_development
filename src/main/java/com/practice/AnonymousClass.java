package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 17/05/14
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */

class ParentMachine{
    public void start(){
        System.out.println("Starting machine...");
    }
}

interface InterfacePlant{
    public void grow();
}


public class AnonymousClass {
    public static void main(String[] args) {

        //creation of an anonymous class
        //this is anonymous because its a child class of ParentMachine, but the class has no name
        //basically here we are overriding the start() method WITHOUT extending the ParentMachine to (for example Camera)
        // the object here is not ParentMachine() - the reference might be of type ParentMachine, but the object is not
       ParentMachine machine = new ParentMachine(){
           @Override
           public void start(){
               System.out.println("Machine working");
           }
       };
        machine.start();

        //do the same as above but with interface
        InterfacePlant plant = new InterfacePlant() {
            @Override
            public void grow() {
                System.out.println("plant growing");
            }
        };

        plant.grow();
    }
}
