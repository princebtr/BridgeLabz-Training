//Problem Statement: Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below
//
//Hint => 
//Write a Method to get the name of the month. For this define a month Array to store the names of the months
//Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
//Write a method to get the first day of the month using the Gregorian calendar algorithm
//Displaying the Calendar requires 2 for loops. 
//The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
//The Second for loop displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat

import java.util.Scanner;
public class MonthCalender {
	
//	Method to find Month's name
	public static String nameOfMonth(int m) {
		switch(m) {
		case(1): return "January";
		case(2): return "february";
		case(3): return "March";
		case(4): return "April";
		case(5): return "May";
		case(6): return "June";
		case(7): return "July";
		case(8): return "August";
		case(9): return "September";
		case(10): return "October";
		case(11): return "November";
		case(12): return "December";
		}
		return "Invalid Month";
	}
	
	// Method to check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

 // Method to get number of days in month
    public static int daysInMonth(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year))
            return 29;

        return days[month - 1];
    }
    
//    Method to find first day of month
    public static int firstDay(int m , int y) {
    	int y0 = y-(14-m)/12;
    	int x = y0+(y0/4)-(y0/100)+(y0/400);
    	int m0 = m+12*((14-m)/12)-2;
    	int d0 = (1+x+(31*m0)/12)%7;
    	return d0;
    }
    
//    Main Method
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Month 1 to 12");
		int m = input.nextInt();
		if(m > 12 || m < 1) return;
		System.out.println("Enter Year");
		int y = input.nextInt();
		
		boolean leap = isLeapYear(y);
		String month = nameOfMonth(m);
		int days = daysInMonth(m,y);
		int first = firstDay(m,y);
		
		System.out.println(month + " " + y);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		for (int day = 1; day <= days; day++) {
		    if (day == 1) {
		        for (int i = 0; i < first; i++) {
		            System.out.print("    ");
		        }
		    }
		    System.out.printf("%3d ", day);
		    if ((day + first) % 7 == 0) {
		        System.out.println();
		    }
		}

	}

}
