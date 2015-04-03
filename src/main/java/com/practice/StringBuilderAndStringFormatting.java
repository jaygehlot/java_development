package com.practice;

public class StringBuilderAndStringFormatting {

	public static void main(String args[]){
		
		//Inefficient - because lots of String objects are being created and only the reference 'info' 
		//is pointing at the new object
		
		String info = "";
		info += "BOB";
		info += " ";
		info += "Builder";
		
		System.out.println(info);		
         
		//More efficient.
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
         
        System.out.println(sb.toString());
		
        StringBuilder s = new StringBuilder();
        System.out.println( (s.append("My name is Roger").append(" ").append("I am a skydiver.")).toString() );
        
	}
	
}
