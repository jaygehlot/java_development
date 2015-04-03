package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 05/10/13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class Oak extends Plant {

  public Oak() {

    // this wont work -- type is private in the parent class
    //type = "plant type";

    // because 'size' is protected, subclasses can access it
    // and classes within the same package can access it
    this.size = "large";

    //this works because Oak and Plant are in the same package -- default access specifier
    this.height = 20;
  }
}
