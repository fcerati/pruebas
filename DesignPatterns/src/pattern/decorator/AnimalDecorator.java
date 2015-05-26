package pattern.decorator;

public abstract class AnimalDecorator implements IAnimal {

	IAnimal animal;

	public AnimalDecorator(IAnimal animal) {
		this.animal = animal;
	}
	
}
