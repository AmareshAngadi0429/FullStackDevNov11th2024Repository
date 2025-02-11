package com.gentech.test3;
class Tes1
{
    Tes1()
    {
        System.out.println("this is a construcor");
    }
    void mtd()
    {
        System.out.println("this is a instance method");
    }
}
public class Tese31 {
    public static void main(String[] args) {
        Tes1 t = new Tes1();
        t.mtd();
    }
}
