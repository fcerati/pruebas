package pattern.proxy;

import java.util.Date;

public class FastThing implements IThing {

	@Override
	public void sayHello() {
		System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
	}

}
