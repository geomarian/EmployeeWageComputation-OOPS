/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class EmpWageNewCompanyUC8 extends CalculateEmpWageMain {
	
	int workingDays = 20, Wage = 30000;
	String companyName = "Microsoft";
	int workingHours = 100;
	
	//constructor overloading
	public EmpWageNewCompanyUC8(String companyName) {
		System.out.println("---------------------");
		this.companyName = companyName;
	
	}
	
	public EmpWageNewCompanyUC8(int workingDays, int Wage ) {
		
		this.workingDays = workingDays;
		this.Wage = Wage;
		System.out.println("No. of working days = " +  workingDays);
		System.out.println("Wage is = " +  Wage);
	
	}
	public EmpWageNewCompanyUC8(int workingHours) {
		this.workingHours = workingHours;
		System.out.println("No. of working days = " +  workingHours);
	}

	public EmpWageNewCompanyUC8() {
		// TODO Auto-generated constructor stub
	}




	

}
	