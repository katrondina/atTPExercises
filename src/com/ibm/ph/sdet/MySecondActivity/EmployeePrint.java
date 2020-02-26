package com.ibm.ph.sdet.MySecondActivity;

public class EmployeePrint {

	public static void main(String[] args) {
		
		Employee emp = new HourlyEmployee("Katrina", "Rondina", "QC", 29, "Aug 20, 2910");
		((HourlyEmployee) emp).setHourlyRate(90); ((HourlyEmployee) emp).setHoursPerDay(8);
		printInfo(emp);
		
		emp = new SalaryEmployee("Taylor", "Swift", "New York", 30, "Dec 13, 1989");
		((SalaryEmployee) emp).setAnnualRate(125000);
		printInfo(emp);
		
		emp = new CommissionEmployee("Majin", "Bu", "London", 300, "Dec 13, 1990");
		((CommissionEmployee) emp).setPercentage(0.5);
		printInfo(emp);

	}
	
	public static void printInfo(Employee emp) {
		System.out.println("--- Employee Details ---");
		System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Salary: " + emp.computeSalary());
		System.out.println("\n");
	}

}