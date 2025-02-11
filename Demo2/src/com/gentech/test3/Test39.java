package com.gentech.test3;
class Tes91
{
    void mtd1(){
        System.out.println("this is a instance mts");
    }
    static void mtd2(){
        System.out.println("this is static mtd");
    }

}
class Tes92
{
    {
        Tes91 t1 = new Tes91();
        t1.mtd1();
        Tes91.mtd2();
    }
}
public class Test39 {
    public static void main(String[] args) {
        Tes92 t = new Tes92();
    }
}
