package com.java.udemyscratchpad.multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/06/14
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class MultipleExceptions {
    public void run() throws IOException, ParseException {
        //throw new IOException();

        throw new ParseException("Error in command", 2);
    }

    public void input() throws IOException, FileNotFoundException{     //FileNotFoundException is a child of IOException so FileNotFoundException not needed here

    }
}
