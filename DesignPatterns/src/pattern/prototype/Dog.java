package pattern.prototype;

public class Dog implements IPrototype {

	String sound;

	public Dog(String sound) {
		this.sound = sound;
	}

	@Override
	public IPrototype doClone() {
		return new Dog(sound);
	}

	public String toString() {
		return "This dog says " + sound;
	}
	
}
