package com.gentech.test4;
interface I1
{
    void mtd1();
}
interface I2
{
        void mtd2();
}
interface I3 extends I2,I1
{
        void mtd3();
}
class imp implements I3
{

    @Override
    public void mtd3() {
        System.out.println("mtd3");
    }

    @Override
    public void mtd2() {
        System.out.println("mtd2");
    }

    @Override
    public void mtd1() {
        System.out.println("mtd1");
    }
}
public class Test415 {
    public static void main(String[] args) {
        imp i = new imp();
        i.mtd1();
        i.mtd2();
        i.mtd3();
    }
}
