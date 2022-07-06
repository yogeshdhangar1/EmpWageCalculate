package com.Bridgelabz;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Emp Wage Builder");
		int isFullTime=1;
		int WagePerHour=20;
		int  empHrs = 0 , empDailyWage = 0 ;
		double empCheck = Math.floor(Math.random () * 10 ) % 2 ;
		if ( empCheck==isFullTime) {
			empHrs = 8 ;
			empDailyWage = (empHrs*WagePerHour);
			System.out.println(" Employee is Present :-" + empDailyWage );
		} else {
			System.err.println(" Employee is Absent :-" + empDailyWage );
		}
	}
}