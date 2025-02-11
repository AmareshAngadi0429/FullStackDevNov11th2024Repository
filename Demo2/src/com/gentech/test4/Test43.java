package com.gentech.test4;
class Test31
{
    void mtd1()
    {
        System.out.println("this is super class");
    }
}
class Test32 extends Test31{

    Test32()
    {
        super.mtd1();
    }
    Test32(int x)
    {
        System.out.println("value of x" +x);
    }
}
public class Test43 {
    public static void main(String[] args) {
        Test32 t  = new Test32(3);
    }
}
