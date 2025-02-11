package com.gentech.test3;
class Tes21
{
    void mtd1()
    {
        System.out.println("this is mtd 1");
    }
    void mtd2()
    {
        System.out.println("this is mtd  2");
    }
}
class Tes22 extends Tes21
{
    Tes22()
    {
        mtd1();
        mtd2();
    }

}
public class Test32 {
    public static void main(String[] args) {
        Tes22 t = new Tes22();
    }
}
