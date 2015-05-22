package pattern.factory.abstracts;

public class AbstractFactory {

	public ISpeciesFactory getSpeciesFactory(String type) {
		if ("mammal".equals(type)) {
			return new MammalFactory();
		} else {
			return new ReptileFactory();
		}
	}

	
}
