package pattern.proxy;

import java.util.Date;

public class SlowThing implements IThing {

	public SlowThing() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void sayHello() {
		System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
	}

}
