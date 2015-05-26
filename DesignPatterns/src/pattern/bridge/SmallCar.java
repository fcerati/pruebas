package pattern.bridge;


public class SmallCar extends Vehicle {
	
	public SmallCar(IEngine engine) {
		this.weightInKilos = 600;
		this.engine = engine;
	}

	@Override
	public void drive() {
		System.out.println("\nThe small car is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}

}
