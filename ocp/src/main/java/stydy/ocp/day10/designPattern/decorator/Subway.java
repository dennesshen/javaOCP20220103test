package stydy.ocp.day10.designPattern.decorator;

import stydy.ocp.day10.designPattern.decorator.sideDish.Egg;
import stydy.ocp.day10.designPattern.decorator.sideDish.Ham;
import stydy.ocp.day10.designPattern.decorator.sideDish.Olives;

public class Subway {

	public static void main(String[] args) {
		Food food = new Bread();
		System.out.println(food);

		food = new Egg(food);
		System.out.println(food.getName());
		System.out.println(food.getPrice());
		System.out.println(food);
		
		food = new Ham(food);
		System.out.println(food.getName());
		System.out.println(food.getPrice());
		System.out.println(food);
		
		food = new Olives(food);
		System.out.println(food);
	}

}
