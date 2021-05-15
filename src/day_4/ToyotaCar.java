package day_4;

public class ToyotaCar extends AbstractCar {

	int speed = 0;
	@Override
	void accerelarateCar() {
		speed = speed + 2;
		System.out.println("Accelerated Speed: "+speed);
	}

	@Override
	void stopCar() {
		speed = 0;
		System.out.println(" Car Stopped ");
	}
	
	public static void main(String[] args) {
//		AbstractCar car = new AbstractCar();
		
	}
//	@Override
//	void startCar() {
//		System.out.println(" Car Started ");		
//	}

}
