package stydy.ocp.day20;


public class Fibonacci2 {
	int n1 = 1;
	int n2 = 1;
	
	public long fib(int n) {
		long result = 0;
		if (n <=2 ) {
			return n;
		}
		for(int i = 3;i <= n; i++) {
			result = n1 + n2;
			if(i%2 == 1) {
				n1 = n1 + n2;
			}else {
				n2 = n1 + n2;
			}
		}
		return result;
	}
}
