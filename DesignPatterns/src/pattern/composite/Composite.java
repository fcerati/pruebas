package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

	List<IComponent> components = new ArrayList<IComponent>();

	@Override
	public void sayHello() {
		for (IComponent component : components) {
			component.sayHello();
		}
	}

	@Override
	public void sayGoodbye() {
		for (IComponent component : components) {
			component.sayGoodbye();
		}
	}

	public void add(IComponent component) {
		components.add(component);
	}

	public void remove(IComponent component) {
		components.remove(component);
	}

	public List<IComponent> getComponents() {
		return components;
	}

	public IComponent getComponent(int index) {
		return components.get(index);
	}

}
