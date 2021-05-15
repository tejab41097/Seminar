package day_4;

public class BMWCar extends ParentCar {

	boolean autoGearBox = true;

	public static void main(String[] args) {
		BMWCar bmwCar = new BMWCar();
		bmwCar.color = "red";
		bmwCar.accelrateSpeed();
		bmwCar.brakeCar();
		//same class method getting called
		bmwCar.setEngine();
		System.out.println("Car Engine: " + bmwCar.engine);
		//parent class method getting called
		bmwCar.setEngine("V2");
		System.out.println("Car Engine: " + bmwCar.engine);
	}

	//Overriding - happens inheritance. method should have same return type, same parameters & same method name
	@Override
	void accelrateSpeed() {
		speed = speed + 2;
		System.out.println("Accelerated Speed: "+speed);
	}
	
	void setEngine() {
		engine = "Version_";
		System.out.println("Engine: "+engine);
	}
}
