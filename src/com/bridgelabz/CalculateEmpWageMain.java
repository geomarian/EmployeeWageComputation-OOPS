/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class CalculateEmpWageMain {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Full Time salary
		EmpWageFullTime fullwage = new EmpWageFullTime();
		fullwage.setDataF(20, 8);
		fullwage.showDataF();
		
		
		//Part time salary
		EmpWagePartTime halfwage = new EmpWagePartTime();
		halfwage.setDataP(20, 4);
		halfwage.showDataP();
		
		
		// Multiple Companies -- Method overloading
		
		EmpWageCompanyUC8 newCompany = new EmpWageCompanyUC8();
		newCompany.companyName("IBM");
		newCompany.companyName(30, 100);
		newCompany.companyName(8);
		
		
		System.out.println("-------------------");
		// Multiple Companies -- constructor overloading
		EmpWageNewCompanyUC8 newCompany1 = new EmpWageNewCompanyUC8();
		System.out.println("Company name is: " + newCompany1.companyName);
		System.out.println("Wage is = " +  newCompany1.Wage);
		System.out.println("No. of working days = " +  newCompany1.workingDays);
		System.out.println("No. of working days = " +  newCompany1.workingHours);
		
		
		NewCompany newcomp = new NewCompany();
		
		
		
		
		
	}

}
