package com.practice;


/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 05/10/13
 * Time: 16:56
 * To change this template use File | Settings | File Templates.
 */

/*
private -- only within same class only
public -- from anywhere
protected -- subclass and same package only
default (no modifier) --- same package only
 */
public class Plant {
  public String name;

  public final static int ID= 8;

  private String type;

  protected String size;

  int height;  //package level visibility

  public Plant() {
    this.name = "Freddy";
    this.type = "plant";
    this.size = "medium";
    this.height = 20;
  }
}
