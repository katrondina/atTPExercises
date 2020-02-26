package com.ibm.ph.sdet.MySecondActivity;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private String birthDate;
	private int sss = 500;
	private int pagibig = 500;
	
	
	public Employee() {
		
	}
	
	// constructor for 
	public Employee(String firstName, String lastName, String address, int age, String birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	public double getDeductions() {
		double deductions;
		deductions = this.pagibig + this.sss;
		return deductions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public abstract double computeSalary();
}
