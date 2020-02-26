package com.ibm.ph.sdet.MySecondActivity;

public class SalaryEmployee extends Employee implements SalaryEmployeeInterface{
	
	public SalaryEmployee(String firstName, String lastName, String address, int age, String birthDate) {
		super(firstName, lastName, address, age, birthDate);
		// TODO Auto-generated constructor stub
	}

	private double annualRate;
	
	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}
	
	public double getAnnualRate() {
		return annualRate;
	}
	
	public double getBaseSalary() {
		return annualRate / 12;
	}

	@Override
	public double computeSalary() {
		double thirteenthMonth;
		thirteenthMonth = this.getBaseSalary() - super.getDeductions();
		return thirteenthMonth;
	}

}
