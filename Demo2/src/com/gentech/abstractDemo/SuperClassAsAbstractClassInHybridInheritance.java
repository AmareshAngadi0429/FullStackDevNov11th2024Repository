package com.gentech.abstractDemo;
abstract class Parent7
{
    abstract void bank(String name);
    abstract void bankBranch(String bName);
}

abstract class SubClass1OfParent7 extends Parent7
{
    abstract void Customer(String cName);
}

abstract class SubClass2OfParent7 extends Parent7
{
    abstract void EmployeeName(String eName);
}

class Base71 extends SubClass1OfParent7
{

    @Override
    void Customer(String cName) {
        System.out.println("Customer Name : "+cName);
    }

    @Override
    void bank(String name) {
        System.out.println("Bank Name : "+name);
    }

    @Override
    void bankBranch(String bName) {
        System.out.println("Branch Name : "+bName);
    }
}
class Base72 extends SubClass2OfParent7
{

    @Override
    void EmployeeName(String eName) {
        System.out.println("Employee Name : "+eName);
    }

    @Override
    void bank(String name) {
        System.out.println("Bank Name : "+name);
    }

    @Override
    void bankBranch(String bName) {
        System.out.println("Branch Name : "+bName);
    }
}

public class SuperClassAsAbstractClassInHybridInheritance {
    public static void main(String[] args) {
        Base71 b1 = new Base71();
        Base72 b2 = new Base72();
        b1.bank("SBI");
        b1.bankBranch("Bengaluru");
        b1.Customer("Amaresh");
        b2.bank("SBI");
        b2.bankBranch("Bengaluru");
        b2.EmployeeName("Satish");
    }
}
