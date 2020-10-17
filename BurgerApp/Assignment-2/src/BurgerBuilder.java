public class BurgerBuilder {

	PrepareBurger burger = new PrepareBurger();

	public PrepareBurger HealthyBurger() {

		burger.addItem(new HealthyBurger());
		return burger;
	}

	public PrepareBurger HamBurger() {

		burger.addItem(new HamBurger());
		return burger;
	}

	public PrepareBurger DeluxeBurger() {

		burger.addItem(new DeluxeBurger());
		burger.addItem(new Chips());
		burger.addItem(new Drinks());
		return burger;
	}

	public PrepareBurger Tomato() {

		burger.addItem(new Tomato());
		return burger;
	}

	public PrepareBurger Lettuce() {

		burger.addItem(new Lettuce());
		return burger;
	}

	public PrepareBurger Lentils() {

		burger.addItem(new Lentils());
		return burger;
	}

	public PrepareBurger Cheese() {

		burger.addItem(new Cheese());
		return burger;
	}
	
	public PrepareBurger Egg() {

		burger.addItem(new Egg());
		return burger;
	}

}