//Problem Statement: Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
//Hint => 
//Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
//Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
//Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
//Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format

import java.util.Scanner;
public class BonusOfEmployees {

//	Method to find salary and years of experience
	public static int[][] randomSalary(){
		int[][] employee = new int[10][2];
		for(int i=0; i<10; i++) {
			employee[i][0] = 10000 + (int)(Math.random() * (99999 - 10000 + 1));
			employee[i][1] = (int)(Math.random()*20);
		}
		return employee;
	}
	
//	Method to calculate bonus
	public static int bonusSalary(int salary, int yoe) {
		if(yoe > 5) return (salary*5)/100;
		return (salary*2)/100;
	}
	
//	Main method
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		int[][] employee = randomSalary();
		for(int i=0; i<10; i++) {
			int bonus = bonusSalary(employee[i][0],employee[i][1]);
			System.out.println("Bonus of Employee "+(i+1)+" is : "+bonus);
		}
	}

}
