package pattern.bridge;


public class BigBus extends Vehicle {

	public BigBus(IEngine engine) {
		this.weightInKilos = 3000;
		this.engine = engine;
	}

	@Override
	public void drive() {
		System.out.println("\nThe big bus is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}

}
