package com.gentech.test3;
class Tes31
{
    int x;
    int y;
    static int a;
    static  int b;
    void mtd1()
    {
        System.out.println("value of x: " +x);
    }
    static void mtd2()
    {
        System.out.println("value of a "+ a);
    }
}
class Tes32 extends Tes31
{
    Tes32(int x ,int a)
    {
        super.x=x;
        super.a=a;
        super.mtd1();
        Tes31.mtd2();

    }

}
public class Test33 {
    public static void main(String[] args) {
        Tes32 t = new Tes32(1,2);
    }
}
