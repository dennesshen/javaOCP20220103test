package stydy.ocp.day07;

public class Coffee implements Drink{
	private String name = "咖啡";
	private Integer price = 75;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getPrice() {
		return price;
	}

}
