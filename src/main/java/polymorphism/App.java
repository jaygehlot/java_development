package com.java.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 06/10/13
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class App {

  public static void main(String[] args) {
    Plant plant1 = new Plant();
    Tree tree = new Tree();

    Plant plant2 = tree;   //can be pointed at child class due to polymorphism
                          // Tree is subclass (or child class) of Plant

    plant2.grow();    //this will use the grow() method on the Tree class
                      // because plant2 object reference is point to the Tree class

    tree.leavesShedding();

    //plant2.leavesShedding();
    // this wont work because when calling a method what matters is the type of
    // the variable (or reference), the reference will know what methods to call
    // if it is pointing at an object

    System.out.println("Calling doGrow method ------------------");
    doGrow(tree);    //this will print out 'Tree growing'
    doGrow(plant2);  //this will print out 'Tree growing' , because plant2 variable is pointing to the Tree object
    doGrow(plant1);  //this will print out 'Plant growing'

    //wherever parent class is expected, child class of the parent can be used
  }

  public static void doGrow(Plant plant) {
    plant.grow();
  }
}
