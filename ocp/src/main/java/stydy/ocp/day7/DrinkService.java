package stydy.ocp.day7;

import java.util.Optional;
import java.util.Random;

public class DrinkService {
	
	public void print(Drink drink) {
		System.out.printf("飲料名:%s，價格:%d", drink.getName(), drink.getPrice());
	}
	
	public Optional<Drink> getRandomDrink(){
		Random r  = new Random();
		Optional<Drink> drink = Optional.ofNullable(null);
		switch (r.nextInt(4)) {
			case 0:
				drink = Optional.of(new RedTea());
				break;
			case 1: 
				drink = Optional.of(new Coffee());
				break;
			case 2:
				drink = Optional.of(new Latte());
				break;
			case 3:
		}
		return drink;
	}

}
