package stydy.ocp.day10.designPattern.decorator;

public class SideDish extends Food{
	
	protected Food food;
	
	public SideDish(Food food) {
		this.food = food;
	}
	
	@Override
	public String getName() {
		return food.getName() + "+" + name;
	}

	@Override
	public int getPrice() {
		return price + food.getPrice();
	}
	
	@Override
	public String toString() {
		return "Food [ name=(" + getName() +"), price=" + getPrice() +"]" ;
	}

}
