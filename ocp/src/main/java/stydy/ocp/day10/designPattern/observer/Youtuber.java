package stydy.ocp.day10.designPattern.observer;

public class Youtuber extends Subject{

	@Override
	public void notifyObserver(String data) {
		list.stream().forEach(observer -> observer.update(" Youtuber -> "+data));
	}

}
