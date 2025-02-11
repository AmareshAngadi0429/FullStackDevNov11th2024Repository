package com.gentech.mulconstructors;

class Employee{
    int eId;
    String eName;
    int age;
    String address;
    String qualification;
    String jobRole;
    String dept;
    int experience;
    double salary;
    String dateOfJoin;

    Employee(int eId,String eName)
    {
        this.eId = eId;
        this.eName =eName;
        System.out.println("eId: "+eId);
        System.out.println("eName: "+eName);
    }
    Employee(int age,String address,String qualification)
    {
        this(11,"Amaresh");
        this.age =age;
        this.address = address;
        this.qualification =qualification;
        System.out.println("age: "+age);
        System.out.println("address: "+address);
        System.out.println("qualification: "+qualification);
    }
    Employee(String jobRole,int experience){
        this(28,"Raichur","BE");
        this.jobRole=jobRole;
        this.experience =experience;
        System.out.println("jobRole: "+jobRole);
        System.out.println("experience: "+experience);

    }
    Employee(String dept){
        this("Manager",5);
        this.dept=dept;
        System.out.println("dept: "+dept );
    }
    Employee(double salary,String dateOfJoin){
        this("Accountant");
        this.salary =salary;
        this.dateOfJoin =dateOfJoin;
        System.out.println("Salary: "+ salary);
    }


}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(2000.11,"12-12-2024");
    }
}
