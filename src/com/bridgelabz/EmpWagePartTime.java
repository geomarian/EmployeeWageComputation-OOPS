/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class EmpWagePartTime extends CalculateEmpWageMain{
	
	int empRatePerHr;
	int empHrsPartTime;
	
	public void setDataP(int empRatePerHr, int empHrsPartTime) {
		this.empHrsPartTime = empHrsPartTime;
		this.empRatePerHr = empRatePerHr;
		
	}
	public void showDataP() {
		int salary = empRatePerHr*empHrsPartTime;
		System.out.println("Employee Part time Monthly salary is = " + salary);
	}
	
	

}
