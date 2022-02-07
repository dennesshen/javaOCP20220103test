package stydy.ocp.day9;

//PENNY = 1, NICKLE = 5, DIME = 10, 
public enum USCurrency {
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
