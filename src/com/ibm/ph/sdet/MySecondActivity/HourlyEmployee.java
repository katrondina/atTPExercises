package com.ibm.ph.sdet.MySecondActivity;

public class HourlyEmployee extends Employee implements HourlyEmployeeInterface {
	
	public HourlyEmployee(String firstName, String lastName, String address, int age, String birthDate) {
		super(firstName, lastName, address, age, birthDate);
		// TODO Auto-generated constructor stub
	}

	private double hourlyRate;
	private int hoursPerDay;
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	
	public int getHoursPerDay() {
		return hoursPerDay;
	}

	@Override
	public double computeSalary() {
		double monthlySalary;
		monthlySalary = (this.hourlyRate * this.hoursPerDay * 20) - super.getDeductions();
		return monthlySalary;
	}

	
}
