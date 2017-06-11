package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 27/07/13
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */

class Thing  {
   public final static int LUCKY_NUMBER = 7; //final means this variable (or field) is a constant and cannot be changed
   public String name;                //instance variables - every separate instance of a class has its own copy of this variable
   public static String description;  //static or class variables - these are associated with the class
   public static int count = 0;
   public int id;                   //intended to store the id for each object that is created

   public Thing()  {
       id = count;  //id will be assigned the value of count, so each time an object is created
                    //id will be assigned that value, and each Thing object will have its own id
                     //but count is static and therefore is shared among objects

       //count will be incremented each time an object is instantiated
       count++;
   }

   public void showName() {
       System.out.println("Object ID: " + id + "; " + name);

       //static variables can be accessed in non static methods
       System.out.println(description);
   }

   public static void showInfo() {
        System.out.println(description);
   }
}

public class App {
    public static void main(String[] args)  {

        Thing.description = "I belong to the Thing class";
        Thing.showInfo();

        System.out.println("Before creating objects, count is:" + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is:" + Thing.count);

        thing1.name= "Bob";
        thing2.name= "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}


