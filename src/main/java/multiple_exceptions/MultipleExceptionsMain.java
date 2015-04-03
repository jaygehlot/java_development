package com.java.udemyscratchpad.multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/06/14
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class MultipleExceptionsMain {
    public static void main(String[] args){
        MultipleExceptions test = new MultipleExceptions();

        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();      //catch multiple exceptions - one for IOException and one for ParseException
        } catch (ParseException e) {
            System.out.println("Couldn't parse command field");
        }

        try {
            test.run();
        } catch (IOException | ParseException e) {       //
            e.printStackTrace();  //Java 7 allows piping of exceptions , so no multiple catches required
        }

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();  //or catch the parent exception instead of IOException and ParseExceptions
                                        //because both are children of Exception
        }

        try {
            test.input();
        } catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }
}
