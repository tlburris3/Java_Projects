package objects;

/**
 * Employee Class
 * 
 * Purpose:
 * 		Takes in parameters within its constructor in order
 * 		to create references that will be used for
 * 		encapsulation, rather than creating a normal class
 * 		that uses setter methdos to reach the
 * 		information that is within the Employee reference
 * 		that will be created.
 * 
 * Notes:
 * 		. Encapsulation means that the variables are private,
 * 		and there are no setter functions so there are no 
 * 		ways of changing them outside of the class itself.
 * 		. One way to set the variables are inside the constructor.
 * 		. Another is by functions that are public, yet they restrict
 * 		outside influences by doing all of the changes inside the
 * 		class only. 
 * 
 * @author laneburris
 *
 */
public class Employee {
	private String name = "";
	private int empId = 0;
	private double salary = 0.0;
	private long ssn = 0;
	
	
	public Employee (String name, int id, double sal, long ssn) {
		this.name = toCamelCase(name);
		this.empId = id;
		this.salary = sal;
		this.ssn = ssn;
	}
	
	
	// Getter functions
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	public long getSsn() {
		return ssn;
	}
	
	public String toCamelCase(String name) {
		StringBuilder builder = new StringBuilder();
		String[] sMNameTokens = name.split("\\s");
		for (int i = 0; i < sMNameTokens.length; i++) {
			String word = sMNameTokens[i].substring(0, 1).toUpperCase() + sMNameTokens[i].substring(1);
			builder.append(word);
			builder.append(" ");
		}
		
		return builder.toString();
	}
	
	public void raiseSalary(double raise) {
		salary += raise;
	}
	
	public String toString () {
		return "\n" + "Employee Name: " + getName() + "\n" +
					  "Employee ID: " + getEmpId() + "\n" +
					  "Employee SSN: " + getSsn() + "\n" +
					  "Employee Salary: " + getSalary() + "\n";
	}
}
