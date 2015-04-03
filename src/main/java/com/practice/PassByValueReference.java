package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 02/01/15
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
public class PassByValueReference {
    public static void main(String[] args) {

        //========================================================================

        PassByValueReference passByValueReference = new PassByValueReference();

        //Java will always pass by value

        int value = 7;

        System.out.println("Value is: " + value);

        passByValueReference.show(value);

        System.out.println("Value is: " + value);

        //===========================================================================
        //Java passes by value for primitive and non primitive types, which just means passing the
        //object reference value , internally its means making a copy of the address that object reference is pointing to
        // and passing that through to the method

        System.out.println();

        Person person = new Person("Jay");
        System.out.println("1. Person is :" + person);

        //the person object is holding the object reference, the memory address of the 'new Person()' object
        //its then passing the object reference, its passing the memory address, to the show method
        passByValueReference.show(person);

        System.out.println("4. Person is :" + person);
    }

    //value will be give a copy of temp when show is called
    //this is called passing by value
    //all we are doing is passing 'a value' into the method

    public void show(int value){
        System.out.println("Value is: "+ value);

        value = 8;

        System.out.println("Value is: " + value);
    }

    public void show(Person person){
        System.out.println("2. Person is :" + person);

        //by calling setName on person reference value, the original object reference variable
        //that is passed through (by value), will be changed
        //person that is passed through to this method still refers to the original object so 4. Person will show
        //Mohan
        person.setName("Mohan");

        person = new Person("Nidhi");

        //person.setName("Aarya");
        System.out.println("3. Person is: "+ person);
    }
}
