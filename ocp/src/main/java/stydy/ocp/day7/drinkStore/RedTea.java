package stydy.ocp.day7.drinkStore;

public class RedTea implements Drink{
	private String name = "紅茶";
	private Integer price = 20;

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public Integer getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public void howToMake() {
		System.out.println("煮紅茶");
	}

}
