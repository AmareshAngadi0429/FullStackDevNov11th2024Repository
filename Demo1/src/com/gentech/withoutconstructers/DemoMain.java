package com.gentech.withoutconstructers;

class Employees
{
	int eId;
	String eName;
	int age;
	int experience;
	String jobrole;
	double salary;
}

class Department
{
	int deptId;
	String deptName;
	String address;
	int noOfEmployees;
	String deptContact;
}

class Insurance
{
	int insId;
	String insType;
	double insTerm;
	double insReturns;
	String maturityDate;
	
}
public class DemoMain {

	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.eId =001;
		emp.eName="Rajesh";
		emp.age=27;
		emp.jobrole="manager";
		emp.experience = 5;
		emp.salary = 30000.34;
		System.out.println("eId: " +emp.eId);
		System.out.println("eName: "+emp.eName);
		System.out.println("age: "+emp.age);
		System.out.println("jobRole: "+emp.jobrole);
		System.out.println("experience: "+emp.experience);
		System.out.println("salary: "+emp.salary);
		System.out.println("--------------------------------------------");
		
		Department dept = new Department();
		dept.deptId=3;
		dept.deptName="Marketing";
		dept.noOfEmployees = 40;
		dept.address="Sindhanur";
		dept.deptContact= "7899937778";
		System.out.println("deptId: "+dept.deptId);
		System.out.println("deptName: "+dept.deptName);
		System.out.println("no.OfEmployees: "+dept.noOfEmployees);
		System.out.println("address: "+dept.address);
		System.out.println("deptontact: "+dept.deptContact);
		System.out.println("---------------------------------------------");
		
		Insurance ins = new Insurance();
		ins.insId =420;
		ins.insType ="Longterm";
		ins.insTerm = 4.5;
		ins.insReturns = 50000.34;
		ins.maturityDate = "12-1-2028";
		System.out.println("insId: "+ins.insId);
		System.out.println("insType: "+ins.insType);
		System.out.println("insTerm: "+ins.insTerm);
		System.out.println("insReturn: "+ins.insReturns);
		System.out.println("insMaturityDate: "+ins.maturityDate);
	}

}
