package com.java.udemyscratchpad;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 29/05/14
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public interface SmallToy {
    int BAR = 5;
    //void go();
}

class Test implements SmallToy{
    void go(){
        //BAR = 6;        //var is a constant in the interface because its implicitly static and final
    }
}
