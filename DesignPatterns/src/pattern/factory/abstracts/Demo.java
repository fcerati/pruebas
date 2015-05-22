package pattern.factory.abstracts;

public class Demo {

	public static void main(String[] args) {
		
		AbstractFactory abstractFactory = new AbstractFactory();

		ISpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
		IAnimal a1 = speciesFactory1.getAnimal("tyrannosaurus");
		System.out.println("a1 sound: " + a1.makeSound());
		IAnimal a2 = speciesFactory1.getAnimal("snake");
		System.out.println("a2 sound: " + a2.makeSound());

		ISpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
		IAnimal a3 = speciesFactory2.getAnimal("dog");
		System.out.println("a3 sound: " + a3.makeSound());
		IAnimal a4 = speciesFactory2.getAnimal("cat");
		System.out.println("a4 sound: " + a4.makeSound());
	}

}
