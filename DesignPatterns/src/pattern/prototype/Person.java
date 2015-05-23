package pattern.prototype;

public class Person implements IPrototype {

	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public IPrototype doClone() {
		return new Person(name);
	}

	public String toString() {
		return "This person is named " + name;
	}
	
}
