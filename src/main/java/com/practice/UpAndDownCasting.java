package com.practice;

class Machine{
	public void start(){
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started");
	}
	
	public void snap(){
		System.out.println("Photo snapped.");
	}
}

public class UpAndDownCasting {
	
	public static void main(String args[]){
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		Machine machine2 = camera1;		//upcasting - handled by polymorphism
		machine2.start();				//going up the class hierarchy
		
		Machine machine3 = new Camera();
		Camera cam = (Camera)machine3;		//downcasting - need to be explicitly done
		cam.snap();							// going down the class hierarchy

        Machine m4 = new Machine();
        //Camera c4 = (Machine) m4; cannot do this since it throws ClassCastException, you can make a Camera, a Machine
        //at runtime m4 is a Machine and Camera isn't a machine.

        //c4.start();
	}	

}
