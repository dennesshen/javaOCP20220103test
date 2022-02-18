package stydy.ocp.day11;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Exam implements Comparable<Exam>{
	private String name;
	private Integer score;
	
	public Exam() {
	}

	public Exam(String name, Integer score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Exam o) {
		return score - o.getScore();
	}

	
}
