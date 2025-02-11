package com.gentech.withconstructers;

class Employees
{
	int eId;
	String eName;
	int age;
	int experience;
	String jobrole;
	double salary;
	Employees()
	{
		eId =11;
		eName="Santosh";
		age=30;
		jobrole="IG";
		experience = 5;
		salary = 800000.34;
		System.out.println("eId: " +eId);
		System.out.println("eName: "+eName);
		System.out.println("age: "+age);
		System.out.println("jobRole: "+jobrole);
		System.out.println("experience: "+experience);
		System.out.println("salary: "+salary);
		System.out.println("--------------------------------------------");
	}
}

class Department
{
	int deptId;
	String deptName;
	String address;
	int noOfEmployees;
	String deptContact;
	Department()
	{
		deptId=8;
		deptName="Sales";
		noOfEmployees = 110;
		address="Sindhanur";
		deptContact= "7899937778";
		System.out.println("deptId: "+deptId);
		System.out.println("deptName: "+deptName);
		System.out.println("no.OfEmployees: "+noOfEmployees);
		System.out.println("address: "+address);
		System.out.println("deptontact: "+deptContact);
		System.out.println("---------------------------------------------");
	}
}

class Insurance
{
	int insId;
	String insType;
	double insTerm;
	double insReturns;
	String maturityDate;
	Insurance()
	{
		insId =20;
		insType ="Longterm";
		insTerm = 9.5;
		insReturns = 150000.34;
		maturityDate = "12-1-2035";
		System.out.println("insId: "+insId);
		System.out.println("insType: "+insType);
		System.out.println("insTerm: "+insTerm);
		System.out.println("insReturn: "+insReturns);
		System.out.println("insMaturityDate: "+maturityDate);
	}
	
	
}
public class Demomain1 {

	public static void main(String[] args) {
		Employees emp = new Employees();
		Department dept = new Department();
		Insurance ins = new Insurance();
		
	}
}
