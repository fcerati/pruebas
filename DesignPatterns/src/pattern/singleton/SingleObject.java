package pattern.singleton;

public class SingleObject {

	// Creamos un solo objeto SingleObject
	private static SingleObject instance = null;

	// Hacemos el constructor privado asi no se puede inicializar
	private SingleObject() {
	}

	// Obtenemos el unico elemento
	public static SingleObject getInstance() {
		if (instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
