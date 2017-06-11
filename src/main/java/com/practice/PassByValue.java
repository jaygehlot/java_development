package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 02/01/15
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
public class PassByValue {
    public static void main(String[] args) {

        //========================================================================

        PassByValue passByValue = new PassByValue();

        //Java will always pass by value

        int value = 7;

        System.out.println("Value is: " + value);

        //variables are always copies of any variable passed into the method
        //i.e. 'value' is a copy that is passed into 'show'
        passByValue.show(value);

        System.out.println("Value is: " + value);

        //===========================================================================
        //Java passes by value for primitive and non primitive types, which just means passing the
        //object reference value , internally its means making a copy of that data, i.e. the address that object reference is pointing to
        // and passing that through to the method

        System.out.println();

        Person person = new Person("Jay");
        System.out.println("1. Person is :" + person);

        //the person object is holding the object reference, the memory address of the 'new Person()' object
        //its then passing the object reference, its passing the memory address, to the show method
        passByValue.show(person);

        System.out.println("4. Person is :" + person);
    }

    //value will be give a copy of temp when show is called
    //this is called passing by value
    //all we are doing is passing 'a value' into the method

    //this is called PASSING BY VALUE

    public void show(int value){
        System.out.println("Value is: "+ value);

        value = 8;

        System.out.println("Value is: " + value);
    }

    //the variable we are passing 'person' is a COPY of the 'person' object reference created above the main() method
    //where passByValue.show(person) is called

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
