package week2_zhangtianlu.practice3;

public class PartTimeEmployee extends Employee implements SalaryCalculatable {
	private int hourlyPay,workingHours;
	
	public PartTimeEmployee(String name ,int hourlyPay,int workingHours ) {
		super(name);
		this.hourlyPay = hourlyPay;
		this.workingHours = workingHours;
	}
	
	@Override
	public int calculateSalary() {
		return hourlyPay*workingHours;
	}
}