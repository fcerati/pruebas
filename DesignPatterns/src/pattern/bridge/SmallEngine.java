package pattern.bridge;

public class SmallEngine implements IEngine {

	int horsepower;

	public SmallEngine() {
		horsepower = 100;
	}

	@Override
	public int go() {
		System.out.println("The small engine is running");
		return horsepower;
	}
	
}
