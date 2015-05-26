package pattern.composite;

public class Leaf implements IComponent {

	String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println(name + " leaf says hello");
	}

	@Override
	public void sayGoodbye() {
		System.out.println(name + " leaf says goodbye");
	}

}
