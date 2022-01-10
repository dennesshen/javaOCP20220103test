package stydy.ocp.day3;

public class StringAndStringBuilder {
	
	public static void main(String[] args) {
		String str = "Java";
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(str);
		System.out.println(sb);
		append(str);
		append(sb);
		System.out.println(str);
		System.out.println(sb);
		str = add(str);
		System.out.println(str);
	}
	
	public static void append(String str) {
		str = str.concat("8");
	}
	
	public static void append(StringBuffer sb) {
		sb.append("8");
	}
	
	public static String add(String str) {
		str = str.concat("8");
		return str;
	}
	

}
