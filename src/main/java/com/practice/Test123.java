package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 31/05/14
 * Time: 11:30
 * To change this template use File | Settings | File Templates.
 */
public class Test123 {

    public static void main(String[] args) {
        new Moo().useAZoo();
    }
}

class Zoo{
    public String coolMethod(){
        return "Wow baby";
    }
}

class Moo extends Zoo{
    public void useAZoo(){
        System.out.println("A Zoo says," + coolMethod());
    }
}
