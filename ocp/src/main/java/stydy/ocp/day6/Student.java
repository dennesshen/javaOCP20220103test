package stydy.ocp.day6;

public class Student extends Person {
	private Integer score;

	public Student() {
	}
	
	public Student(String name, Integer age, Integer score) {
		super.setName(name);
		super.setAge(age);
		this.score = score;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "toString() =" + super.toString() + "]";
	}
	
	

}
