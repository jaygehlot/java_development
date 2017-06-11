package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 17/05/14
 * Time: 23:03
 * To change this template use File | Settings | File Templates.
 */
public class ReadingFilesUsingScanner {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:/Users/41629Ja/Desktop/example.txt";

        File file = new File(fileName);

        Scanner in = new Scanner(file);

        while(in.hasNextLine()){
            String textInFile = in.nextLine();
            System.out.println(textInFile);
        }

        in.close();
    }

}
