package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 29/05/14
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
public interface Toy extends LargeToy, SmallToy {

    int MY_CONST = 5; //constants must always be public static final for an interface
    void bounce();

    void setBounceFactor(int bf);
    //no public or abstract modifiers needed, that is implicit

    abstract public void method1();
    public abstract void method2();
    //final void method3();         //method is implicitly abstract, abstract and final dont mix
    //static method4();             //method in interface need to be instances not static
    //private method5();           //methods in interface are implicitly public
}
