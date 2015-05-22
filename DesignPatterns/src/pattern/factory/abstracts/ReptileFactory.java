package pattern.factory.abstracts;

public class ReptileFactory implements ISpeciesFactory {
	
	@Override
	public IAnimal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}

}
