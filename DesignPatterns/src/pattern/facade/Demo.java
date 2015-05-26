package pattern.facade;

public class Demo {

	public static void main(String[] args) {

		Facade facade = new Facade();

		int x = 3;
		System.out.println("Cube of " + x + ":" + facade.cubeX(3));
		System.out.println("Cube of " + x + " times 2:" + facade.cubeXTimes2(3));

	}

}
