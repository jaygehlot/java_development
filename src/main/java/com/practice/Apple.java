package com.practice;

import food.Fruit;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 26/05/14
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */

public class Apple extends Fruit {

    private int weight;
    private String colour;

    public boolean isGreenApple() {
        return "green".equals(getColour());
    }

    public boolean isHeavyApple() {
        return getWeight() > 150;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }
}
