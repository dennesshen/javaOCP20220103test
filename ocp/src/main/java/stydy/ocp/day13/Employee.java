package stydy.ocp.day13;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private String name;
	private String neighborhood;
	private int salary;

	public Employee() {
	}
	
	public Employee(String name, String neighborhood, int salary) {
		this.name = name;
		this.neighborhood = neighborhood;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, neighborhood, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && Objects.equals(neighborhood, other.neighborhood)
				&& salary == other.salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", neighborhood=" + neighborhood + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.hashCode() - o.hashCode();
	}
	
}