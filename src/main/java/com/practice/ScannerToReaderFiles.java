package com.practice;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 07/06/14
 * Time: 18:24
 * To change this template use File | Settings | File Templates.
 */
public class ScannerToReaderFiles{

    public static void main(String[] args) throws FileNotFoundException {
        String fileNameFromDisk = "C:\\Users\\41629Ja\\Desktop\\example.txt";
        String fileNameFromFileInIntelliJ = "example.txt";

        File textFile = new File(fileNameFromFileInIntelliJ);

        Scanner in = new Scanner(textFile);

        int numOnFirstLine = in.nextInt();
        System.out.println(numOnFirstLine);

//        for (int i=0; i <= numOnFirstLine; i++){
//            System.out.println(in.nextLine());
//        }

        //there is a newline character after the int, which nextInt doesn't read
        //but nextLine does
        // to get over this do the following - reading in the new line character

        in.nextLine();

        int count = 2;
        while (in.hasNextLine()){
            String line = in.nextLine();             //but nextLine does
            //System.out.println(line);

            System.out.println(count + ":" + line);
            count++;
        }
        in.close();


    }
}
