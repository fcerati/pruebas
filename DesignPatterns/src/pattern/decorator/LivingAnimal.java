package pattern.decorator;

public class LivingAnimal implements IAnimal {

	@Override
	public void describe() {
		System.out.println("\nI am an animal.");
	}

}
