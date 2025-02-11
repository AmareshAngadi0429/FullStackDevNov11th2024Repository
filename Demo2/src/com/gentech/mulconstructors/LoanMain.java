package com.gentech.mulconstructors;

class Loan{
    int loanId;
    String custName;
    String address;
    String contact;
    String loanType;
    long loanAmount;
    double intrestRate;
    String intrestType;
    long noOfEmi;
    long cibilScore;
    Loan(int loanId,String custName){
        this.loanId=loanId;
        this.custName=custName;
        System.out.println("loanId: "+loanId);
        System.out.println("custName: "+custName);
    }
    Loan(String address, String contact){
        this(21,"rajesh");
        this.address = address;
        this.contact=contact;
        System.out.println("address: "+address);
        System.out.println("contact: "+contact);
    }
    Loan(String loanType,long loanAmount){
        this("Bengaluru","9900870320");
        this.loanType=loanType;
        this.loanAmount=loanAmount;
        System.out.println("loanType: "+loanType);
        System.out.println("loanAmount: "+loanAmount);
    }
    Loan(double intrestRate,String intrestType)
    {
        this("Homeloan",90000);
        this.intrestRate=intrestRate;
        this.intrestType=intrestType;
        System.out.println("intrestRate: "+intrestRate);
        System.out.println("intrestType: "+intrestType);
    }
    Loan(long noOfEmi,long cibilScore){
        this(2.5,"Compound");
        this.noOfEmi=noOfEmi;
        this.cibilScore=cibilScore;
        System.out.println("noOfEmi: "+noOfEmi);
        System.out.println("cibilScore: "+cibilScore);
    }
}
public class LoanMain {
    public static void main(String[] args) {
        Loan l =new Loan(120,743);
    }
}
