package com.Bridgelabz;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Emp Wage Builder");
		int IS_FULL_TIME=1;
		double empCheck= Math.floor(Math.random() * 10) % 2 ;
		if (empCheck== IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.err.println("Employee is Absent");

	}



}


