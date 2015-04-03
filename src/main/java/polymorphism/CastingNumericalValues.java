package com.java.polymorphism;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 06/10/13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class CastingNumericalValues {

  public static void main(String[] args) {

    byte byteValue = 20;
    short shortValue = 55; //16 bits
    int intValue = 888; //32bits
    long longValue = 2355; //64 bits

    float floatValue = 8834.4f;
    double doubleValue = 32.4;

    System.out.println(Byte.MAX_VALUE);

    intValue = (int) longValue;          //casting the long to an int , cast is necessary because precision may be lost
    System.out.println(intValue);

    doubleValue = intValue;              //here no cast is necessary, no precision is lost since double is bigger than int
    System.out.println(doubleValue);

    intValue = (int)floatValue;     //casting a float to an int will loose precision in the value
    System.out.println(intValue);

    byteValue = (byte) 128;
    System.out.println(byteValue); //128 is too big for a byte and so this statement prints out something else
  }
}
