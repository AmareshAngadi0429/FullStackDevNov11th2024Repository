package com.gentech.test3;
class Tes81
{
    {
        System.out.println("this is a instance block");
    }
    void mtd1()
    {
        System.out.println("this is a instance mtd");
    }

}
class Tes82
{
    static
    {
        Tes81 t1 = new Tes81();
        t1.mtd1();
    }
}
public class Test38 {
    public static void main(String[] args) {
        Tes82 t = new Tes82();
    }
}
