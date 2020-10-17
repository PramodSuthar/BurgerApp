import java.util.Scanner;

public class BurgerDemo {
	public static void main(String[] args) {

		int choice, choice1;
		char ch = 'y';
		char ch1 = 'y';
		Scanner sc = new Scanner(System.in);

		while (ch1 == 'y' || ch1 == 'Y') {
			BurgerBuilder hamburgerBuilder = new BurgerBuilder();
			BurgerBuilder healthyburgerBuilder = new BurgerBuilder();
			BurgerBuilder deluxeburgerBuilder = new BurgerBuilder();
			System.out.println("1. Basic ham burger");
			System.out.println("2. Healthy burger");
			System.out.println("3. Deluxe burger");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				PrepareBurger hamBurger = hamburgerBuilder.HamBurger();
				System.out.println("Basic Ham Burger");
				ch = 'y';
				// hamBurger.showItems();
				while (ch == 'y' || ch == 'Y') {
					System.out.println("1. Add Tomato");
					System.out.println("2. Add Lettuce");
					System.out.println("3. Add Cheese");
					System.out.println("4. No toppings");
					choice1 = sc.nextInt();
					switch (choice1) {
					case 1:
						hamBurger = hamburgerBuilder.Tomato();
						// hamBurger.showItems();
						break;

					case 2:
						hamBurger = hamburgerBuilder.Lettuce();
						break;

					case 3:
						hamBurger = hamburgerBuilder.Cheese();
						break;
						
					case 4: break;
					}
					System.out.println("Add another topping?");
					ch = sc.next().charAt(0);
				}
				hamBurger.showItems();
				System.out.println("Total Cost: " + hamBurger.getCost());
				break;

			case 2:
				PrepareBurger healthyBurger = healthyburgerBuilder.HealthyBurger();
				System.out.println("Healthy Burger");
				ch = 'y';
				// hamBurger.showItems();
				while (ch == 'y' || ch == 'Y') {
					System.out.println("1. Add Egg");
					System.out.println("2. Add Lentils");
					System.out.println("3. No toppings");
					choice1 = sc.nextInt();
					switch (choice1) {
					case 1:
						healthyBurger = healthyburgerBuilder.Egg();
						// hamBurger.showItems();
						break;

					case 2:
						healthyBurger = healthyburgerBuilder.Lentils();
						break;
						
					case 3:
						break;
					}
					System.out.println("Add another topping?");
					ch = sc.next().charAt(0);
				}
				healthyBurger.showItems();
				System.out.println("Total Cost: " + healthyBurger.getCost());
				break;

			case 3:
				PrepareBurger deluxeBurger = deluxeburgerBuilder.DeluxeBurger();
				System.out.println("Deluxe Burger");
				deluxeBurger.showItems();
				System.out.println("Total Cost: " + deluxeBurger.getCost());
				break;

			default:
				System.out.println("Invalid choice");

			}
			System.out.println("Want another burger? (y/n)");
			ch1 = sc.next().charAt(0);
		}
		sc.close();
	}
}