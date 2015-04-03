package com.java.udemybasics;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 27/10/13
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
public class Generics {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add("apple");
    list.add("banana");
    list.add("pear");

    String fruit = (String) list.get(0); //here the get method returns an Object because generics is not used
    System.out.println(fruit);


    ArrayList<String> list2 = new ArrayList<String>();

    list2.add("cat");
    list2.add("dog");
    list2.add("aligator");

    String animal = list2.get(0);        //here the get method returns a String, because we are defining the String
    System.out.println(animal);           // type, so no casting is needed,
                                          // because we are saying ArrayList<String>, get returns a type String


    ////////////MORE THAN ONE TYPE ARGUMENT/////////////////
    HashMap<Integer, String> map = new HashMap<Integer, String>();


  }

}
