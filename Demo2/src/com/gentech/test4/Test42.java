package com.gentech.test4;
abstract class Test21
{
    abstract void mtd1();
}
abstract class  Test22 extends Test21
{
    abstract void mtd2();
}
interface Test23
{
    void mtd3();
}
class Test24 extends Test22 implements Test23
{

    @Override
    void mtd2() {
        System.out.println("mtd2");
    }

    @Override
    void mtd1() {
        System.out.println("mtd1");
    }

    @Override
    public void mtd3() {
        System.out.println("mtd3");
    }
}
public class Test42 {
    public static void main(String[] args) {
        Test24 t = new Test24();
        t.mtd1();
        t.mtd2();
        t.mtd3();
    }
}
