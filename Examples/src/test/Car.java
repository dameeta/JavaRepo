package test;

abstract class Vehicle{


    abstract public void move();
    abstract public void speed();

    
}
public class Car extends Vehicle{

	public void move() {
		// TODO Auto-generated method stub
	    System.out.println("Car is moving fast from one place to other...");

	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
	    System.out.println("Car has  4 wheels...");

	}

	
	public static void main(String[] args) {


 Car suzuki=new Car();

suzuki.move(); 
suzuki.speed();
 


}


}