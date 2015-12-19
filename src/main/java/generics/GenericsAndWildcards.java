package com.java.generics;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 31/10/13
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */


class Machine{

  //toString method is a method in the Object class which here is overriden
  //since Machine, by default, inherits from Object
  @Override
  public String toString(){
    return "I am a machine";
  }

  public void start() {
    System.out.println("Machine starting");
  }
}

class Camera extends Machine{

  @Override
  public String toString(){
    return "I am a camera";
  }

  public void snap(){
    System.out.println("snap");
  }
}

  public class GenericsAndWildcards {

    public static void main(String[] args) {
      ArrayList<Machine> list1 = new ArrayList<Machine>();

      list1.add(new Machine());
      list1.add(new Machine());

      ArrayList<Camera> list2 = new ArrayList<Camera>();

      list2.add(new Camera());
      list2.add(new Camera());

      showList(list1);
      System.out.println("-------------");
      showListMk2(list2);
      showListMk3(list1);

                                      //ArrayList<Camera> is not a subclass of ArrayList<Machine> even though Camera extends Machine
    }                                //the ? (wildcard operator) lets us pass a list of any type to to the method
                                    //ArrayList<?>

    public static void showListObj(ArrayList list) {
      for(Object value: list){
        System.out.println(value);
      }
    }

    public static void showList(ArrayList<?> list) {
      for(Object value: list){
        System.out.println(value);
      }
    }

    //putting restrictions or constraints on ArrayList parameter, we are saying we can only pass in
    //ArrayLists with type Machine, or anything that extends Machine (this could be any class, but it must extend Machine)
    //? extends Machine - means either a Machine or subtype of Machine
    public static void showListMk2(ArrayList<? extends Machine> list) {
      for(Machine value: list){
        System.out.println(value);
        value.start();
        //value.snap();       //will not work because Java doesn't know all the methods in all the subclasses of Machine
      }
    }

    //Camera or superclass of Camera
    // Cannot go any further down the inheritance hierarchy, past Camera and can only go up, i.e. up to Machine
    // or Object, but we dont know if Machine inherits from any other class so Object is the only class
    // we can go up to
    public static void showListMk3(ArrayList<? super Camera> list){
      for(Object value: list){
        System.out.println(value);
      }
    }

  }
