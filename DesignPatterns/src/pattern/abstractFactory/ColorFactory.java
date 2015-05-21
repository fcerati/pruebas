package pattern.abstractFactory;

import pattern.commons.Constantes;

public class ColorFactory extends AbstractFactory {

	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {
		
		if (color == null) {
			return null;
		}
		
		if (color.equalsIgnoreCase(Constantes.RED)) {
			return new Red();
		} else if (color.equalsIgnoreCase(Constantes.BLUE)) {
			return new Blue();
		}

		return null;
	}

}
