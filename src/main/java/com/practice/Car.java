package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 26/05/14
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */
abstract class Car {
    private double price;
    private String model;
    private String year;

    public abstract void goFast();
    public abstract void goUpHill();
    public abstract void impressNeigbours();
}

class AnotherClass{
//Car c = new Car();
    //cannot instantiate Car object because it is abstract
}
