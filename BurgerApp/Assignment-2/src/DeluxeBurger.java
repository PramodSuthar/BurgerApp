
public class DeluxeBurger extends Burger {

	private String meat;
	private String roll;

	DeluxeBurger(){
		
		meat = "Sausage & bacon";
		roll = "white roll";
	}
	
	@Override
	public String name() {
		
		return "Deluxe burger on a " +roll+" with "  + meat ;
	}

	@Override
	public float price() {
		
		return 20.0f;
	}
	
	
}
