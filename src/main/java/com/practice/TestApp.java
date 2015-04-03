package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 05/10/13
 * Time: 16:57
 * To change this template use File | Settings | File Templates.
 */
public class TestApp {
  public static void main(String[] args) {
    Plant plant = new Plant();

    System.out.println(plant.name);
    System.out.println(Plant.ID);

    //wont work type variable is private
    //System.out.println(plant.type);

    // size is protected, so it will because this class is in the same package
    // if this class was in a different package, this wouldn't work
    System.out.println(plant.size);

    //works because Plant and TestApp classes are in the same package
    System.out.println(plant.height);

  }
}
