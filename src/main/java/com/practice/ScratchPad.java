package com.practice;

import java.util.HashMap;
import java.util.Map;

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

  public Map<String, String> topping2(Map<String, String> map) {

    Map<String, String> result = new HashMap<>();

    map.forEach((key, value) -> {
        if (key.equals("ice cream")) {
            result.put("ice cream", value);
            result.put("yogurt", value);
        }

        if (key.equals("yogurt") && !map.containsKey("ice cream")) {
          result.put("yogurt", value);
        }

        if (key.equals("spinach")) {
          result.put("spinach", "nuts");
      }
      });

    map.forEach(result::putIfAbsent);  //iterates over all of contents if map, if the keys aren't present in the result
                                      //map then stick em in 'result'

    return result;
  }
}
