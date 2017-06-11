package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayBuffer {

    public static void main(String[] args) {
        List<String> entries = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String line = "";

        // this will continuously read in from command line
        //exit on pressing enter key
        //https://coderanch.com/t/532303/java/java/input-Scanner-exit-pressing-enter
//        while ((line = scan.nextLine()).length() > 0 ) {
//            entries.add(line);
//        }

        int numOfEntries = Integer.valueOf(scan.nextLine());
        for (int i= 0; i < numOfEntries; i++) {
            entries.add(scan.next());
        }

        scan.close();

        for (int i=0 ; i < entries.size(); i++) {
            splitText(entries.get(i));
        }
    }

    private static void splitText(String text) {
        String evenChars = "";
        String oddChars = "";

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                evenChars += String.valueOf(text.charAt(i));
            } else {
                oddChars += String.valueOf(text.charAt(i));
            }
        }
        System.out.println(evenChars + " " + oddChars);
    }
}
