package stydy.ocp.day22;

import java.io.Closeable;
import java.io.IOException;

class Bar implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("้้Bar");
	}
	
}

class Foo implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("้้Foo");		
	}
	
}


public class AutoCloseableDemo {
	public static void main(String[] args) {
		try (Bar bar = new Bar();
			 Foo foo = new Foo()){
			
		} catch (Exception e) {
		}
	}
}
