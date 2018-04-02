package com.practice;


class TestThing{
	public String name;
	public static String description;
	
	public void showName(){
		//can access description because it is static and the instance of the name variable
		System.out.println(description + ": " + name);
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
}

public class Lecture23_Static_And_Final {
	
	public static void main(String args[]){
		
		TestThing.description = "I am a thing";
		
		System.out.println(Thing.description);
		TestThing.showInfo();
		
		TestThing thing1 = new TestThing();
		TestThing thing2 = new TestThing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
	}

}
