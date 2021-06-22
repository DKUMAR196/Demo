#!/bin/bash -x

public class EmpWageTotalWorkingHrs {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	public static final int emp_rate_per_hrs = 20;
	public static final int num_of_working_days = 2;
	public static final int max_hrs_in_month = 1;
	
	
	public static void main(String[] args) {
	    //Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDay = 0;
		//Computation
		while (totalEmpHrs <= max_hrs_in_month && 
				totalWorkingDay < num_of_working_days ) {
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case is_part_time:
			     empHrs = 4;
			     break;
			     
			case is_full_time:
			     empHrs = 8;
			     break;
			     
			     default:
			    	 empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDay + "Emp Hr: " + empHrs);
		}
			int totalEmpWage = totalEmpHrs * emp_rate_per_hrs;
			System.out.println("Total Emp Wage: " + totalEmpWage);
			
		}
	}
