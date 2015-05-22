package pattern.factory;

import pattern.commons.Constantes;

public class ShapeFactory {

	public IShape getShape(String shapeType) {
		
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase(Constantes.CIRCLE)) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase(Constantes.RECTANGLE)) {
			return new Rectangle();
		}

		return null;
	}

}
