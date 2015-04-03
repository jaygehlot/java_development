package com.java.udemyscratchpad.exceptions_part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 08/06/14
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionHandling {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fr = new FileReader(file);
    }

}
