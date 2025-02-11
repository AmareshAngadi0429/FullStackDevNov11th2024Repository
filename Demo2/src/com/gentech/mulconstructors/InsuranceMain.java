package com.gentech.mulconstructors;

class Insurance{
    int insId;
    String custName;
    int age;
    String address;
    String contactNo;
    int policyId;
    String policyType;
    long premiumAmount;
    String paymentFrequency;
    int insTerm;
    double returns;
    Insurance(int insId,String custName)
    {
        this.insId=insId;
        this.custName=custName;
        System.out.println("insId "+insId);
        System.out.println("custName "+custName);
    }
    Insurance(int age, String address, String contactNo)
    {
        this(21,"Amaresh");
        this.age=age;
        this.address=address;
        this.contactNo=contactNo;
        System.out.println("age: "+age);
        System.out.println("address:"+address);
        System.out.println("contactno: "+contactNo);
    }
    Insurance(int policyId)
    {
        this(20,"Bengaluru","7899937778");
        this.policyId=policyId;
        System.out.println("policyId: "+policyId);
    }
    Insurance(String policyType,long premiumAmount){
        this(20);
        this.policyType=policyType;
        System.out.println("policyType "+policyType);
        System.out.println("premiumAmmount: "+premiumAmount);
    }
    Insurance(String paymentFrequency,int insTerm,double returns)
    {
        this("Term Insu",20000);
        this.paymentFrequency=paymentFrequency;
        this.insTerm=insTerm;
        this.returns=returns;
        System.out.println("paymentFrequency: "+paymentFrequency);
        System.out.println("insTerm: "+insTerm);
        System.out.println("returns: "+returns);
    }
}
public class InsuranceMain {
    public static void main(String[] args) {
        Insurance i = new Insurance("monthly",5,40000);
    }
}
