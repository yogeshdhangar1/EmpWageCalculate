package com.Bridgelabz;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Emp Wage Builder");
		int isPartTime=1;
		int isFullTime=2;
		int WagePerHr=20;
		int empHrs=0;
		int totalEmpHrs=0;
		int empWage=0;
		int numOfWorkingDays=20;
		int EmpRatePerHr = 2;
		int totalEmpWage = 0;
		//loop condition 

		for (int i=0; i < numOfWorkingDays; i++ ) {
			int empCheck = (int)Math.floor (Math.random() * 10 ) % 3;
			switch (empCheck) {
			case 1 :
				empHrs=4;
				break;
			case 2 :
				empHrs=8;
				break;
			default:
				empHrs=0;
				break;
			}
			empWage = empHrs * EmpRatePerHr;
			totalEmpHrs = totalEmpHrs+empHrs;
			System.out.println("Emp Wage:  " +empWage);
		}
		System.out.println("Employee Wage For the Month:- " +totalEmpWage);
	}
}
