/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class EmpWageFullTime extends CalculateEmpWageMain {

	
 int empRatePerHr;
 int empHrsFullTime;

	public void setDataF(int empRatePerHr, int	empHrsFullTime) {
	
			this.empRatePerHr = empRatePerHr;
			this.empHrsFullTime = empHrsFullTime;
		
	}
	public void showDataF() {
			//System.out.println("Employee Wage for Full Time is: ");
			int fullSalary = empRatePerHr*empHrsFullTime;
			System.out.println("Employee Full time Monthly salary is = " + fullSalary);
		
	}

//	public void empHrsFullTime(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void empRatePerHr(int i) {
//		// TODO Auto-generated method stub
//		
//	}
}

