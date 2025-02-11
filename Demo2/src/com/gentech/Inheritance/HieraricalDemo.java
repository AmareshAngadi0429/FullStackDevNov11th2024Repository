package com.gentech.Inheritance;
class Maths
{
    public Maths(int a, int b) {
    }

    int addInt(int a, int b)
    {
       return a+b;
    }
    int mulInt(int x,int y)
    {
        return  x*y;
    }
}
class Maths1 extends Maths
{
    Maths1(int a, int b)
    {
        super(a,b);
    }
    double addDouble(double a, double b)
    {
        return a+b;
    }
}
class Maths2 extends Maths
{
    Maths2(int x,int y)
    {
        super(x,y);
    }
    double mulDouble(double x,double y)
    {
        return x*y;
    }
}
public class HieraricalDemo {
    public static void main(String[] args) {
        Maths1 m1 = new Maths1(4,5);
        Maths2 m2 = new Maths2(2,3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.addInt(1,2));
        System.out.println(m1.addDouble(1.0,2.2));
        System.out.println(m2.mulInt(2,3));
        System.out.println(m2.mulDouble(2.2,2.2));

    }
}

