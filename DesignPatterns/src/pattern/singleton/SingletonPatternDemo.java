package pattern.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		// Obtengo el unico objeto generado
		SingleObject object = SingleObject.getInstance();

		// Muestro el mensaje
		object.showMessage();
	}

}
