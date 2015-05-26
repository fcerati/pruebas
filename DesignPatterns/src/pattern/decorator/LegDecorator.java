package pattern.decorator;

public class LegDecorator extends AnimalDecorator {

	public LegDecorator(IAnimal animal) {
		super(animal);
	}

	@Override
	public void describe() {
		animal.describe();
		System.out.println("I have legs.");
		dance();
	}

	public void dance() {
		System.out.println("I can dance.");
	}

}
