package pattern.easyBuilder;

public interface IMealBuilder {

	public void buildDrink();
	public void buildMainCourse();
	public void buildSide();
	public Meal getMeal();
	
}
