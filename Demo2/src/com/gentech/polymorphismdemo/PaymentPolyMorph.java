package com.gentech.polymorphismdemo;
abstract  class PaymentThrough
{
    abstract void payment();
}
class OnlineBanking extends PaymentThrough
{

    @Override
    void payment() {
        System.out.println("Payment done through Online Banking");
    }
}
class CashPayment extends PaymentThrough
{

    @Override
    void payment() {
        System.out.println("Payment done through Cash");
    }
}
class AccountTransfer extends PaymentThrough
{

    @Override
    void payment() {
        System.out.println("Payment done through Account transfer");
    }
}
public class PaymentPolyMorph {
    public static void main(String[] args) {
        PaymentThrough p;
        OnlineBanking o = new OnlineBanking();
        AccountTransfer a = new AccountTransfer();
        CashPayment c = new CashPayment();

        p=c;
        p.payment();
        p=o;
        p.payment();
        p=a;
        p.payment();
    }
}
