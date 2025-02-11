package com.gentech.test4;
abstract class C5
{
    abstract void mtd();
}
abstract class C6
{
    static  void mtd2()
    {
        System.out.println("this is static");
    }
}
class C7 extends C5
{
    @Override
    void mtd() {
        System.out.println("ths is an instance");
    }
}
public class Test418 {
    public static void main(String[] args) {
        C7 c = new C7();
        c.mtd();
        C6.mtd2();
    }
}
