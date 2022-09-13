/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class EmpWageCompanyUC8 extends CalculateEmpWageMain {

	//Method Overloading
	
	public void companyName(String companyName) {
		System.out.println("---------------------");
		System.out.println("Company name is: " + companyName);
	}
	
	public void companyName(int workingDays, int Wage) {
		System.out.println("No. of working days = " +  workingDays);
		System.out.println("Wage is = " +  Wage);
		
	}
	
	public void companyName(int workingHours) {
		System.out.println("No. of working days = " +  workingHours);
		
		
	}
	
	
}
