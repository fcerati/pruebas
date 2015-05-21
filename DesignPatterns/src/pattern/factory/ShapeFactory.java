package pattern.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		
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
