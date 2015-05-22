package pattern.factory;

import pattern.commons.Constantes;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// Obtengo el objeto CIRCLE y lo dibujo
		IShape shape1 = shapeFactory.getShape(Constantes.CIRCLE);
		shape1.draw();

		// Obtengo el objeto RECTANGLE y lo dibujo
		IShape shape2 = shapeFactory.getShape(Constantes.RECTANGLE);
		shape2.draw();
	}

}
