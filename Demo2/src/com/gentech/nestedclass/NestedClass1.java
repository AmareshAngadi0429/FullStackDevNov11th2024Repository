package com.gentech.nestedclass;
class Outer
{
    static int c;
    static int d;

    Inner i = new Inner();
    void showMul()
    {
        i.a=9;
        i.b=2;
        System.out.println(i.mul());

    }

    private static class Inner
    {
        int a;
        int b;
        void setCD(int c,int d)
        {
            Outer.c=c;
            Outer.d=d;
        }

        public int add()
        {
            return a+b;
        }
        public int mul()
        {
            return c*d;
        }

    }
}
public class NestedClass1 {
    public static void main(String[] args) {
        Outer d = new Outer();
        d.showMul();



    }

}
