package com.gentech.test2;
class Return18
{
    double ret18(double n1,double n2)
    {
        double d = n1/n2;
        return d;
    }
}
public class ReturnDivisionResult {
    public static void main(String[] args) {
        Return18 r = new Return18();
        double re = r.ret18(5,2);
        System.out.println(re);
    }
}
