package com.practice;

import java.util.Scanner;

public class ArrayBuffer_Take2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line, evenChars = "", oddChars = "";

        while ((line = scan.nextLine()).length() > 0 ) {
            if (line.length() > 1) {
                System.out.println(evenChars + " " + oddChars);
                evenChars = "";
                oddChars = "";
               for (int i = 0; i < line.length(); i++) {
                   if (i % 2 == 0) {
                       evenChars += String.valueOf(line.charAt(i));
                   } else {
                       oddChars += String.valueOf(line.charAt(i));
                   }
               }
           }
        }
        scan.close();
        //System.out.println(evenChars + " " + oddChars);
    }
}
