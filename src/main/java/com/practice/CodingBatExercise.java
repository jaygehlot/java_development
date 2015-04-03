package com.java.udemyscratchpad;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 02/11/13
 * Time: 13:00
 * To change this template use File | Settings | File Templates.
 */
public class CodingBatExercise {

  public static void main(String[] args) {
    //System.out.println(loneTeen(13, 99));
    //System.out.println(delDel("adelbc"));
    //System.out.println(startOz("oz"));
    //System.out.println(close10(8,13));
    //System.out.println(endUp("Hello"));
    //System.out.println(everyNth("Chocolate", 3));
    // System.out.println(stringTimes("Oh Boy!", 2));
    // System.out.println(countXX("xxx"));
    //  System.out.println(doubleX("xaxxx"));
     // System.out.println(stringBits("Heelloo"));
      System.out.println(last2("hixxhi"));
  }

    public static int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    private static boolean doubleX(String str) {
        boolean result = false;
        int counter = 0;
        for (int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == 'x'){
              counter++;
                if( str.charAt(i+1) == 'x' && counter == 1 ){
                   result = true;
                    break;
                }
            }
        }
        return result;
    }


    static boolean doubleXNew(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }

    static String stringBits(String str) {
        String result="";

        for(int charPointer = 0; charPointer <= str.length()-1; charPointer+=2){
            result += str.charAt(charPointer);
        }
        return result;
    }

    private static int countXX(String str) {
        int counter=0;
        for (int i=0; i < str.length(); i++){
            if (i+1 < str.length()){
                boolean numberOfX = str.charAt(i) == 'x' && str.charAt(i+1) == 'x';
                    if (numberOfX ){
                      counter ++;
                    }
            }
        }
        return counter;
    }

    private static String stringTimes(String s, int i) {
        String result = "";
        for(int n=1; n <=i; n++){
            result = result + s;
        }
        return result;
    }

    public static String everyNth(String str, int n){
    String tmp="";
    for (int i=0; i<str.length();) {
      tmp = tmp + str.charAt(i);
      i = i + n;
    }
    return  tmp;
  }

  public static String endUp(String str){
    if (str.length() > 3){
      String lastThreeChars = str.substring(str.length() - 3, str.length());
      String firstThreeChars = str.substring(0, str.length() - 3);
      return firstThreeChars + lastThreeChars.toUpperCase();
    } else return str.toUpperCase();
  }

  public static int close10(int a, int b){
    int checkA = Math.abs(a - 10);
    int checkB = Math.abs(b - 10);

    if (checkA == checkB) {
      return 0;
    } return checkA > checkB ? b : a;
  }

  public static boolean loneTeen(int a, int b){
    boolean aTeen = a>=13 && a <=19;
    boolean bTeen = b>=13 && b <=19;

    if (aTeen && !bTeen) {
      return true;
    } else if (!aTeen && bTeen) {
      return true;
    } else return false;
  }

  public static String delDel(String str){
    boolean doesDelExist = false;
    if (str.length() >= 4) {
      doesDelExist = "del".equals(str.substring(1, 4));
    }

    if (doesDelExist) {
      return str.replaceAll("del", "");
    } else return str;
  }

  public static String startOz(String str){


    if (str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z' ){
      return "oz";
    } else if (str.length() >= 2 && str.charAt(1) == 'z') {
      return "z";
    } else if (str.length() >= 1 && str.charAt(0) == 'o') {
      return "o";
    } else return "";

  }

}
