package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 06/10/13
 * Time: 18:04
 * To change this template use File | Settings | File Templates.
 */


class Machne{
  public void start(){
    System.out.println("Machine started.");
  }

}

class Camra extends Machne {
  public void start(){
    System.out.println("Camera started");
  }

  public void snap(){
    System.out.println("Photo taken");
  }
}

public class UpDownCasting {
  public static void main(String[] args) {

    Machine1 machine1 = new Machine1();
    Camra camera1 = new Camra();

    machine1.start();
    camera1.start();
    camera1.snap();

    //Upcasting
    Machne machine2 = camera1;   //polymorphism - referring to child object instead of parent
    System.out.println("Upcasting================");
    machine2.start();            //going to execute start() method in Machine class, because object refers to Machine
    //machine2.snap();         wont work, it is the reference variable that decides which method you can call
                                //snap isn't part of machine, but it is the object itself Camera() or Machine() that decides
                              //the implementation of the method to execute

    //Downcasting - Java requires confirmation, this is inherently unsafe
    Machine machine3 = new Camera();
    Camera camera2 = (Camera) machine3;     //casting variable of type machine to type Camera, downcasting, going down the
    System.out.println("Downcasting=====================");       //inheritance hierarchy
    camera2.snap();
    camera2.start();              //can access the methods on camera because have downcasted


    //can't change machine object to camera object, and therefore can't call methods on the ref variable
    Machine machine4 = new Machine();
    Camera camera3 = (Camera) machine4;
    System.out.println("Last============");
    camera3.start();
  }
}
