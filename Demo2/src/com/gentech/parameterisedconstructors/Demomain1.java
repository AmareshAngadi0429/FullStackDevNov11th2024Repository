package com.gentech.parameterisedconstructors;

import java.time.LocalDate;

class Employees
{
    int eId;
    String eName;
    int age;
    int experience;
    String jobrole;
    double salary;
    Employees(int eId,String eName,int age,int experience,String jobrole,double salary)
    {
        this.eId =eId;
        this.eName=eName;
        this.age=age;
        this.jobrole=jobrole;
        this.experience = experience;
        this.salary = salary;
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
    Department(int deptId,String deptName,String address,int noOfEmployees,String deptContact)
    {
        this.deptId=deptId;
        this.deptName=deptName;
        this.noOfEmployees = noOfEmployees;
        this.address=address;
        this.deptContact= deptContact;
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
    LocalDate maturityDate;
    Insurance(int insId,String insType,double insTerm,double insReturns, LocalDate maturityDate)
    {
        this.insId =insId;
        this.insType =insType;
        this.insTerm = insTerm;
        this.insReturns = insReturns;
        this.maturityDate = maturityDate;
        System.out.println("insId: "+insId);
        System.out.println("insType: "+insType);
        System.out.println("insTerm: "+insTerm);
        System.out.println("insReturn: "+insReturns);
        System.out.println("insMaturityDate: "+maturityDate);
    }


}

public class Demomain1 {
    public static void main(String[] args) {
        LocalDate maturityDate = LocalDate.now();
        Employees e = new Employees(21,"Amaresh",22,5,"Manager",30000);
        Department d = new Department(11,"Police","Bengaluru",30,"7899937778");
        Insurance i = new Insurance(1,"terminsu",4.5,50000,maturityDate);
    }
}
