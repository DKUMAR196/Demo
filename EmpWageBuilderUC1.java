!#/bin/bash -x
public class EmpWageDailyUC2 {

	public static void main(String[] args) {
				//Constants
				int isfulltime = 1;
				int empRatePerHr = 20;
				
				//Variables
				int empHrs = 0;
				int empWage = 0;
				
				//Computation
				double empCheck = Math.floor(Math.random() * 10) % 2;
				if (empCheck == isfulltime) 
					    empHrs = 8;
				
				else 
						empHrs = 0;
						empWage = empHrs * empRatePerHr;
						System.out.println("Emp Wage: " + empWage);
								
						}
				}
	

