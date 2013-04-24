
public class Person {
	
	private String name;
	private double budget;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Person() {	
	}
	
	public Person(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}
	
}
