package stydy.ocp.day10.designPattern.builder;

public class Client {

	public static void main(String[] args) {
		Car  myCar1 = new CarBuilder().setWheel(5)
									 .setCC(2500)
									 .setDoor(2)
									 .setColor("red")
									 .create();
		System.out.println(myCar1);
		Car  myCar2 = new CarBuilder().create();
		System.out.println(myCar2);
	}

}
