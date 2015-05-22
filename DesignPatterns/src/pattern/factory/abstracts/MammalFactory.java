package pattern.factory.abstracts;

public class MammalFactory implements ISpeciesFactory {

	@Override
	public IAnimal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}
