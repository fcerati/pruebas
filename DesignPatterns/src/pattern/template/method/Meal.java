package pattern.template.method;

public abstract class Meal {

	// Template Method
	public final void doMeal() {
		prepareIngredients();
		cook();
		eat();
		cleanUp();
	}

	public abstract void prepareIngredients();

	public abstract void cook();

	public void eat() {
		System.out.println("Mmm, that's good");
	}

	public abstract void cleanUp();

}
