package com.practice;

import java.util.ArrayList;

class Machine1{

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start(){
		System.out.println("Machine starting.");
	}
	
}

class Camera1 extends Machine1{
	
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap(){
		System.out.println("snap!");
	}
	
}


public class GenericsAndWildcards {

	public static void main(String args[]){
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		//showList2(list2);
		//showList3(list1);
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("apple");
		stringList.add("pear");
		
		
		//showList(stringList);   //this line will not work if the method 'showList' takes in ArrayList<? extends Machine> because
									// that is limiting the input to a Machine type or and class that extends Machine
		
		//an ArrayList<Camera> is not a subclass of ArrayList<Machine> just because Camera inherits from Machine
		// which is why, whilst the argument for showList is ArrayList<Machine> it cannot be passed list2
	}

	// the ? is a wildcard and means that you can pass this method an ArrayList of unknown type
	//Object is the superclass of both Machine and Camera and has a toString method which is over-ridden in both Machine and Camera
	public static void showList(ArrayList<? extends Machine1> list){
		for(Machine1 value:list){
			System.out.println(value);
			
			value.start();  //because Camera extends Machine, it can call the Machine method 'start'
							//but it only knows about Machine
		}
	}
	
	public static void showList2(ArrayList<? super Camera1> list){
			for(Object value:list){
				System.out.println(value);
			}
		}
	
	public static void showList3(ArrayList<?> list){
		for(Object value:list){
			System.out.println(value);
		
		}
	}
}
