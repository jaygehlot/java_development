package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 18/09/13
 * Time: 23:35
 * To change this template use File | Settings | File Templates.
 */
public class ScratchPad {

  public static void main(String args[]){
    System.out.println(posNeg(-4, 5, true));
  }

  public static boolean posNeg(int a, int b, boolean negative) {
    boolean positiveNeg=false;
    if (negative && a < 0 && b <0) {
      positiveNeg = true;
    } else if ((negative) && ((a < 0 && b > 0) || (a > 0 && b < 0))){
      positiveNeg = true;
    } else if (negative && ((a < 0 && b > 0) || (a > 0 && b < 0))){
      positiveNeg = false;
    }
    return positiveNeg;
  }
}
