package com.practice;

public class StringBuilderAndStringFormatting {

	public static void main(String args[]){
		
		//Inefficient - because lots of String objects are being created and only the reference 'info' 
		//is pointing at the new object

		//Strings are immutable - once you've created a string, you can never change it
		
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

		// could use StringBuffer - which is a thread safe version of StringBuilder

		//////////FORMATTING////////////////

		System.out.println("This is a \t tab. \n A newline");

		//Formatting integer
		//formatting character %d allow more control than concatenation
		//the %-10d means the value in that field is output in a field 10 characters wide into that space and the - left alligns it
		System.out.printf("Total cost %-10d; Total quantity %d" , 5, 120);

		//formatting integer and string
		for (int i=0; i<20; i++) {
			//2 means two character spacing
			//%s is for formatting
			System.out.printf("%2d: %s.\n", i, "Some text");
		}

		//formatting floating point - the .2 will print out to 2 decimal places
		System.out.printf("Total value is: %.2f", 5.699999);
		System.out.println("\n");

		//the 20 means 15 character padding to the left of the 3, after the :
		//because 345.7 takes up 5 characters, 15 remaining so 15 character padding to the left of the 3
		System.out.printf("Total value is:%20.1f", 345.699999);
	}
	
}
