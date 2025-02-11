package com.gentech.nestedclass;
class Outer2
{
    static int c;
    static int d;
    Inner2 i = new Inner2();
    void showMul()
    {
        i.a=9;
        i.b=2;
        System.out.println(i.mul());
    }


    static class Inner2
    {
        int a;
        int b;



        public  int add()
        {
            return a+b;
        }
        public int mul()
        {
            return c*d;
        }
    }
}
public class NestedClass2 {
    public static void main(String[] args) {
        Outer2 d = new Outer2();
        d.showMul();
        Outer2.Inner2 inner = new Outer2.Inner2();
        System.out.println(inner.mul());
    }
}
