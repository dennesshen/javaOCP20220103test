package stydy.ocp.day11;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;


@ToString
public class Student implements Comparable<Student>{
	public static boolean desc = false;
	private String name;
	private List<Exam> exams = new ArrayList<>();
	
	public Student() {
	}
	
	public Student(String name, List<Exam> exams) {
		super();
		this.name = name;
		this.exams = exams;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}
	
	
	
	@Override
	public int compareTo(Student o) {
		Integer sum1 = exams.stream().mapToInt(Exam::getScore).sum();
		Integer sum2 = o.getExams().stream().mapToInt(Exam::getScore).sum();
		return (sum1 - sum2) * (desc? -1 : 1);
	}

}
