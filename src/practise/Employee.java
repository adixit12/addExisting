package practise;

public class Employee {

	private String name;
	private double salary;
	private String dateOfJoining;
	

public Employee(String name, double salary, String dateOfJoining) {
	this.name = name;
	this.setSalary(salary);
	this.setDateOfJoining(dateOfJoining);
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name=name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getDateOfJoining() {
	return dateOfJoining;
}

public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}

public String toString()
{
	return "Name: " +name+ " " +
			"Salary: " +salary+ " " +
			"Date of Joining: " +dateOfJoining;
}

}



