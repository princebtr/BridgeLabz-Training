import java.util.Scanner;
public class EmployeeWageCalculator {
	
//	use case 1
	public static boolean isPresent() {
		int pOrA = (int)(Math.random()*2);
		if(pOrA == 1) return true;
		return false;
	}
	
//	use case 2
	public static void wagePerDay() {
		int wagePerHour = 20;
		int workingHour = 8;
		
		int wagePerDay = wagePerHour * workingHour;
		System.out.println("Wage of Employee is "+wagePerDay+" per day");
		wageTillMonth(wagePerDay);
		wageFor100Hours(wagePerDay);
	}
	
//	use case 3
	public static void partTimeWage() {
		int partTime = 1 + (int) (Math.random() * (8-1+1));
		System.out.println("Wage of partTime Employee is "+(partTime*20)+" per day for "+partTime+" hours");
		wageTillMonth(partTime*20);
		wageFor100Hours(partTime*20);
	}
	
//	use case 4
	public static void employee() {
		int emp = (int)(Math.random()*2);
		switch(emp) {
		case(0): wagePerDay();
				break;
		case(1): partTimeWage();
				break;
		}
	}
	
//	use case 5
	public static int wageTillMonth(int wpd) {
		System.out.println("Wage of Employee after working for a month is "+wpd*20);
		return wpd*20;
	}
	
//	use case 6
	public static int wageFor100Hours(int wpd) {
		System.out.println("Wage of Employee after working for 100 hours is "+(wpd/20)*100);
		return (wpd/20)*100;
	}
	
//	Grettings and calling
	public static void main(String[] args) {
//		start greetings
		System.out.println("Welcome to Employee Wage Computation Program");
		
		boolean x = isPresent();
		if(x) {
			System.out.println("User is Present Today");
			employee();
		} else {
			System.out.println("User is Absent Today");
		}

	}

}
