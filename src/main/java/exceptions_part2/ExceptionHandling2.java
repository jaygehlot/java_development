package com.java.udemyscratchpad.exceptions_part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/06/14
 * Time: 12:29
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionHandling2 {
    public static void main(String[] args) {
        File f = new File("test.txt");

        try {
            FileReader fr = new FileReader(f);
            System.out.println("Continuing");
        } catch (FileNotFoundException e) {   //FileNotFoundException is defined here instead of
            System.out.println("File not found " + f.toString());
        }
        System.out.println("finished");  //always executes this line
    }
}
