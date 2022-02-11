package stydy.ocp.day10.designPattern.decorator;

public class Bread extends Food{
	
	public Bread() {
		name = "麵包";
		price = 40;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "Food [ name=(" + getName() +"), price=" + getPrice() +"]" ;
	}

}
