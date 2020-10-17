
public class HamBurger extends Burger {

	private String meat;
	private String roll;

	HamBurger(){
		
		meat = "Sausage";
		roll = "white roll";
	}
	
	@Override
	public String name() {
		
		return "Basic  Hamburger on a " +roll+" with "  + meat ;
	}

	@Override
	public float price() {
		
		return 5.0f;
	}
	

}
