package stydy.ocp.day10.designPattern.decorator.sideDish;

import stydy.ocp.day10.designPattern.decorator.Food;
import stydy.ocp.day10.designPattern.decorator.SideDish;

public class Ham extends SideDish{

	public Ham(Food food) {
		super(food);
		name = "火腿";
		price = 15;
	}

}
