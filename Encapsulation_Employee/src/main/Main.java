package main;

import objects.Employee;

public class Main {
	
	/**
	 * Purpose:
	 * 		Creation of this example is to build an employee class
	 * 		using the Encapsulation concept within Java OOP language.
	 * 
	 * @author tlburris3
	 */
	public static void main(String[] args) {
		Employee e = new Employee ("john doe", 1, 35_000.00, 234557834);
		
		System.out.println(e.toString());
	}

}
