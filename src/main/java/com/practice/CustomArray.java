class Dog{
	private int size; 
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int s){
		size=s;
	}
	
	void bark(){
		if (size > 60){
			System.out.println("Woof, Woof");
		} else if (size > 14){
			System.out.println("Ruff, Ruff");
		} else {
			System.out.println("Yip, Yip");
		}
	}
}

public class CustomArray {

	
	
	public static void main(String args[]){
	 Dog[] pets = new Dog[7];
	 pets[0] = new Dog();		//create the new Dog object so that the zero position points to it
	 pets[0].setSize(30);
		
	System.out.println(pets[0].getSize());
	}
}
