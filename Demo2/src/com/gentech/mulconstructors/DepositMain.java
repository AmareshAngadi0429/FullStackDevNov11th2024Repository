package com.gentech.mulconstructors;

class Deposit{
    int depositId;
    String accHolderName;
    String accType;
    long accNo;
    String ifscCode;
    String depositType;
    double amount;
    String currency;
    long getBalanceBeforeDeposit;
    long balanceAfterDeposit;
    Deposit(int depositId,String accHolderName){
        this.depositId=depositId;
        this.accHolderName=accHolderName;
        System.out.println("depositId: "+depositId);
        System.out.println("accHolderName: "+accHolderName);
    }
    Deposit(String accType,long accNo){
        this(12,"Amaresh");
        this.accType=accType;
        this.accNo=accNo;
        System.out.println("accTyoe: "+accType);
        System.out.println("accNo: "+accNo);
    }
    Deposit(String ifscCode,String depositType){
        this("Savings",78332);
        this.ifscCode=ifscCode;
        this.depositType=depositType;
        System.out.println("ifscCode: "+ifscCode);
        System.out.println("depositType: "+depositType);
    }
    Deposit(double amount,String currency){
        this("2004341234","Cash");
        this.amount=amount;
        this.currency=currency;
        System.out.println("amount: "+amount);
        System.out.println("currencyType: "+currency);
    }
    Deposit(long getBalanceBeforeDeposit, long balanceAfterDeposit){
        this(20000.0,"usd");
        this.getBalanceBeforeDeposit=getBalanceBeforeDeposit;
        this.balanceAfterDeposit=balanceAfterDeposit;
        System.out.println("balanceBeforeDeposit: "+getBalanceBeforeDeposit);
        System.out.println("balanceAfterDeposit: "+balanceAfterDeposit);
    }
}
public class DepositMain {
    public static void main(String[] args) {
        Deposit d =new Deposit(00,20000);
    }
}
