package stydy.ocp.day09;

public class USCurrencyFactory {
	public static void main(String[] args) {
		USCurrency usCoin = USCurrency.DIME;
		System.out.println(usCoin.getValue());
	}
}
