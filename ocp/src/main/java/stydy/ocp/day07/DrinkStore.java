package stydy.ocp.day07;

import java.util.Optional;

public class DrinkStore {
	public static void main(String[] args) {
		Drink d1 = new RedTea();
		Drink d2 = new Coffee();
		Drink d3 = new Latte();
		
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
		
		DrinkService service = new DrinkService();
		Optional<Drink> optDrink = service.getRandomDrink();
		System.out.println( optDrink.isPresent() ? optDrink.get().getName():"銘謝惠顧");
		

	}

}
