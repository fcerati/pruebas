package pattern.abstracts.factory;

import pattern.commons.Constantes;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(Constantes.SHAPE);

		// Obtengo el objeto CIRCLE y lo dibujo
		Shape shape1 = shapeFactory.getShape(Constantes.CIRCLE);
		shape1.draw();

		// Obtengo el objeto RECTANGLE y lo dibujo
		Shape shape2 = shapeFactory.getShape(Constantes.RECTANGLE);
		shape2.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory(Constantes.COLOR);

		//  Obtengo el objeto RED y lo dibujo
		Color color1 = colorFactory.getColor(Constantes.RED);
		color1.fill();

		// Obtengo el objeto BLUE y lo dibujo
		Color color2 = colorFactory.getColor(Constantes.BLUE);
		color2.fill();
		
	}

}
