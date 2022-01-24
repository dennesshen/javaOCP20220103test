package stydy.ocp.day7.drinkStore;

public class Latte implements Drink{
	private String name = "牛奶";
	private Integer price = 40;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}

}
