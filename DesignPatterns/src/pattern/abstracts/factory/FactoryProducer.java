package pattern.abstracts.factory;

import pattern.commons.Constantes;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase(Constantes.SHAPE)) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase(Constantes.COLOR)) {
			return new ColorFactory();
		}

		return null;
	}

}
