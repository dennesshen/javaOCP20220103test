package stydy.ocp.day8_3;

import java.util.Arrays;

public class Army {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Trunk truck = new Trunk();
		Fighter fighter = new Fighter();
		
		Car[] cars = {tank, truck};
		Airplane[] airplanes = {fighter};
		Weapon[] weapons = {tank, fighter};
		
		Object[] army = {cars, airplanes, weapons};
		long count = Arrays.stream(army).flatMap(a -> Arrays.stream( (Object[]) a ) ).count();
		System.out.println(count);
	}
}
