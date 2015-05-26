package pattern.decorator;

public class Demo {

	public static void main(String[] args) {
		IAnimal animal = new LivingAnimal();
		animal.describe();

		animal = new LegDecorator(animal);
		animal.describe();

		animal = new WingDecorator(animal);
		animal.describe();
	}
}
