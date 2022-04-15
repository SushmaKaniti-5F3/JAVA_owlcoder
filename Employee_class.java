package day2;

import java.util.Scanner;

public class Employee_class {
	int empid;
	String ename,desg,address;
	static String company;
	float salary;
	Scanner sc=new Scanner(System.in);
	public void getEmp()
	{
		System.out.println("Empid:");
		empid=sc.nextInt();
		sc.nextLine();
		System.out.println("Emp name:");
		ename=sc.nextLine();
		System.out.println("Company:");
		company=sc.nextLine();
		System.out.println("Designation:");
		desg=sc.nextLine();
		System.out.println("Address:");
		address=sc.nextLine();
		System.out.println("Salary:");
		salary=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("Empid: "+empid+"\nEmp name: "+ename+" \nDesignation: "+desg+"\nCompany: "+company+"\nAddress: "+address+"\nSalary: "+salary);
	}
	public static void main(String[] args) {

		Employee_class e1=new Employee_class();
		Employee_class e2=new Employee_class();

		e1.getEmp();
		e1.display();
		
		e2.getEmp();
		e2.display();
		

	}

}
/*
 * INPUT:
 		Empid:
		465486
		Emp name:
		Kaniti.Kavya Sushma Mounika
		Company:
		Maersk
		Designation:
		Front end developer
		Address:
		Mandapeta
		Salary:
		5000000000
		
 *OUTPUT:
		Empid: 465486 
		Emp name: Kaniti.Kavya Sushma Mounika 
		Designation: Front end developer 
		Company: Maersk 
		Address: Mandapeta 
		Salary: 5.0E9
 */
 