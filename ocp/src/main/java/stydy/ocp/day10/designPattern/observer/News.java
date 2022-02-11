package stydy.ocp.day10.designPattern.observer;

public class News extends Subject{

	@Override
	public void notifyObserver(String data) {
		list.stream().forEach(observer -> observer.update( "news"+ "->"+ data));
	}

}
