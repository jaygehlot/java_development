package com.java.udemybasics;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 24/09/13
 * Time: 18:03
 * To change this template use File | Settings | File Templates.
 */
public class StringStuff {

  public static void main(String args[]){
    System.out.println(frontBack("code"));
  }

  public static String frontBack(String str){
    StringBuilder newString = new StringBuilder(str);
    if (str.length() == 0) {
      return str;
    } else {
      newString.setCharAt(0, str.charAt(str.length()-1));
      newString.setCharAt(str.length()-1, str.charAt(0));
      return newString.toString();
    }
  }
}
