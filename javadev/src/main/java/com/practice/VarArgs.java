package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 20/07/14
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
public class VarArgs {
    void varArgsOne(int... x){

    }

    void varArgsTwo(String... s){
       for(int i=0; i<s.length; i++){
           System.out.println(s[i]);
       }
    }

    public static void main(String[] args) {
        new VarArgs().varArgsTwo("One", "Two", "Three", "Four");
    }
}
