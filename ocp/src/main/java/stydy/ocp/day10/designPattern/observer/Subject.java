package stydy.ocp.day10.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	protected List<Observer> list = new ArrayList<>();
	public void add(Observer observer) {		
		list.add(observer);
		System.out.printf("%s 加入訂閱%s\n", ((User)observer).getName(), this.getClass().getSimpleName());
	}
	public  void remove(Observer observer) {
		list.remove(observer);
		System.out.printf("%s 取消訂閱%s\n", ((User)observer).getName(),this.getClass().getSimpleName());

	};
	public abstract void notifyObserver(String data);

	

}
