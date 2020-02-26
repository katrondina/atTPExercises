package com.ibm.ph.sdet.MySecondActivity;

public class CommissionEmployee extends Employee implements CommissionEmployeeInterface {
	
	public CommissionEmployee(String firstName, String lastName, String address, int age, String birthDate) {
		super(firstName, lastName, address, age, birthDate);
		// TODO Auto-generated constructor stub
	}

	private double percentage;
	private int monthlyRate = 100000;
	
	@Override
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public double getPercentage(double percentage) {
		return percentage;
	}
	
	@Override
	public double computeSalary() {
		double thirteenthMonth;
		thirteenthMonth = this.percentage * this.monthlyRate;
		return thirteenthMonth;
	}

}
