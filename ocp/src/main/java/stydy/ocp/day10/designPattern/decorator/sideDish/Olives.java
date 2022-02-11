package stydy.ocp.day10.designPattern.decorator.sideDish;

import stydy.ocp.day10.designPattern.decorator.Food;
import stydy.ocp.day10.designPattern.decorator.SideDish;

public class Olives extends SideDish{

	public Olives(Food food) {
		super(food);
		name = "橄欖";
		price = 25;
	}

}
