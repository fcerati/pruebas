package pattern.bridge;

public class BigEngine implements IEngine {

	int horsepower;

	public BigEngine() {
		horsepower = 350;
	}

	@Override
	public int go() {
		System.out.println("The big engine is running");
		return horsepower;
	}

}
