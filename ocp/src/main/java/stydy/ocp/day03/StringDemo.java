package stydy.ocp.day03;

public class StringDemo {
	public static void main(String[] args) {
		String words = "she sell sea shell on the sea shore";
		System.out.printf("長度:%d\n", words.length());
		System.out.printf("on 的位置在 %d\n", words.indexOf("on"));
		System.out.printf("off 的位置在 %d\n",words.indexOf("off"));
		System.out.println(words.split(" ").length);
	}
}
