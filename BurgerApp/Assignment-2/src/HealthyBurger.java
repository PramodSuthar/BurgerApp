
public class HealthyBurger extends Burger {
	
	
	private String meat;
	private String roll;

	HealthyBurger(){
		
		meat = "bacon";
		roll = "brown rye roll";
	}
	
	@Override
	public String name() {
		
		return "Healthy burger on a " +roll+" with "  + meat ;
	}

	@Override
	public float price() {
		
		return 10.0f;
	}
	
	


	
}
