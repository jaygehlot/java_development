package com.java.udemyscratchpad;

import com.java.udemybasics.Plant;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 05/10/13
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
public class Tulip extends Plant {

  String size;

  Plant p1 = new Plant();

  public Tulip(){
    //this wont work because, although Tulip extends Plant, Plant is not in same package as Tulip
    //this.size = p1.size;

    // this wont work because 'height' has default level package access, and Tulip and Plant
    // are in different packages
    //p1.height;
  }
}
