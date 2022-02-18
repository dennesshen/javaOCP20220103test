package stydy.ocp.day12;

import java.util.LinkedList;
import java.util.Queue;
//Queue先進先出
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> job = new LinkedList<String>();
		job.offer("熱鍋");
		job.offer("下油");
		job.offer("放蛋");
		job.offer("倒飯");
		job.offer("盛盤");
		System.out.println(job);
		System.out.println(job.peek());//拿第一個但不取出
		System.out.println(job);
		System.out.println(job.poll());//拿第一個且取出
		System.out.println(job);
		System.out.println(job.poll());
		System.out.println(job);
		System.out.println(job.poll());
		
		
	}
}
