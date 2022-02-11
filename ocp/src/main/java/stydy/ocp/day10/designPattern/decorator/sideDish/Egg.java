package stydy.ocp.day10.designPattern.decorator.sideDish;

import stydy.ocp.day10.designPattern.decorator.Food;
import stydy.ocp.day10.designPattern.decorator.SideDish;

public class Egg extends SideDish{

	public Egg(Food food) {
		super(food);
		name = "蛋";
		price = 10;
	}

}
