package com.practice;

import java.util.ArrayList;

public class Generics {

	public static void main(String args[]){
	ArrayList<String> lists = new ArrayList<String>();
	
	lists.add("cat");
	lists.add("dog");
	lists.add("aligator");
	
	String animal = lists.get(1);
	System.out.println(animal);
	}


}
