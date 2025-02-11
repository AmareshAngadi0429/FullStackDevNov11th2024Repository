package com.gentech.test4;
interface A
{
    void mtd1();
    void mtd2();
}
interface B
{
    void mtd3();
}
class C implements A,B
{

    @Override
    public void mtd1() {
        System.out.println("mtd1");
    }

    @Override
    public void mtd2() {
        System.out.println("mtd2");
    }

    @Override
    public void mtd3() {
        System.out.println("mtd 3");
    }

}
public class Test419 {
    public static void main(String[] args) {
        B c = new C();
        c.mtd3();
    }
}
