package com.gentech.test3;
class Tes10
{
    void mtd1()
    {
        System.out.println("instance mtd");
    }
    static void  mtd2()
    {
        System.out.println("static mtd");
    }

}
class Tes102
{
    Tes102()
    {
        Tes10 t = new Tes10();
        t.mtd1();
        Tes10.mtd2();
    }
}
public class Test310 {
    public static void main(String[] args) {
        Tes102 t = new Tes102();
    }
}
