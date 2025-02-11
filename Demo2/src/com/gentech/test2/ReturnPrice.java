package com.gentech.test2;
class return2
{
    double Return()
    {
        double d =399.00;
        return d;
    }
}
public class ReturnPrice {
    public static void main(String[] args) {

        return2 r = new return2();
        double re =r.Return();
        System.out.println(re);
    }
}
