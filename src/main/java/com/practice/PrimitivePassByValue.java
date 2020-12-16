package com.practice;

public class PrimitivePassByValue {

  public static void main(String[] args) {
      int homerAge = 30;
      changeHomerAge(homerAge);
      System.out.println(homerAge);

      String name = "";
      changeToHomer(name);
      System.out.println(name);
  }

    private static void changeToHomer(String name) {
        name = "Homer";
    }

    static void changeHomerAge(int homerAge) {
        homerAge = 35;
    }
}
