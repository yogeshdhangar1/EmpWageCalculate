package com.Bridgelabz;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Emp Wage Builder");
		int isPartTime = 1 , isFullTime = 2 ;
		int WagePerHour = 20 ;
		int empHrs = 0 , empDailyWage = 0;
		int empCheck = (int)Math.floor ( Math.random() * 10 ) % 3 ;
		switch (empCheck)
		{
		case 1 :
			empHrs=4;
			empDailyWage = (empHrs*WagePerHour);
			System.out.println("Employee is Presnet :-" + empDailyWage);
			break;
		case 2 :
			empHrs=8;
			empDailyWage = (empHrs*WagePerHour);
			System.out.println("Employee is Present :-" + empDailyWage);
			break;
		default:
			empHrs=0;
			System.out.println("Employee is Absent :- " +empDailyWage);
			break;	
		}
	}
}