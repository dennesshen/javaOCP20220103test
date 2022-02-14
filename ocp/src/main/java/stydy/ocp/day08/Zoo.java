package stydy.ocp.day08;

public class Zoo {

	public static void main(String[] args) {
		Cat c1 = (Cat) new Tiger();
		Cat c2 = (Cat)c1;
		c1.move();
		c2.move();
		
		Animal animal = new Tiger();
		if (animal instanceof Cat) {
			((Cat)animal).move();
		}else {
			System.out.println("animal 不可轉型成Cat");
		}
		
		if (animal instanceof Fish) {
			((Fish)animal).move();
		}else {
			System.out.println("animal 不可轉型成Fish");
		}
		
	}
	

}
