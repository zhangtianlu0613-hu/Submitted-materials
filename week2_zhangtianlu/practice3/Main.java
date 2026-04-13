package week2_zhangtianlu.practice3;

public class Main {
	public static void main(String[] args) {
		FullTimeEmployee employee1 = new FullTimeEmployee("田中", 300000);
		PartTimeEmployee employee2 = new PartTimeEmployee("佐藤", 1200 , 80);
		PartTimeEmployee employee3 = new PartTimeEmployee("鈴木", 1000 , 60);
		System.out.println(employee1.getName()+" の給与: "+employee1.calculateSalary()+"円");
		System.out.println(employee2.getName()+" の給与: "+employee2.calculateSalary()+"円");
		System.out.println(employee3.getName()+" の給与: "+employee3.calculateSalary()+"円");
	}
}
