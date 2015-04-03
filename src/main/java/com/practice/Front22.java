package com.java.udemybasics;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 28/09/13
 * Time: 21:05
 * To change this template use File | Settings | File Templates.
 */
public class Front22 {
  public static void main(String[] args) {
        front22("");
  }

  public static String front22(String str) {
  String firstTwoChars;
  if (str.length() == 0){
    firstTwoChars = "";
  }
  else if (str.length() <2 ) {
    firstTwoChars = str.substring(0,1);
  } else {
    firstTwoChars = str.substring(0,2);
  }

  return firstTwoChars + str + firstTwoChars;
  }
}
