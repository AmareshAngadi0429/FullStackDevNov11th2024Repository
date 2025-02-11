package com.gentech.nestedclass;
class Outer3
{
    int c=3;
    int d=4;
    Inner3 i = new Inner3();
    void showMul()
    {

        i.a=9;
        i.b=2;
        System.out.println(i.mul());
        System.out.println(i.add());
    }

    private class Inner3
    {
        private int a;
        private int b;

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
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
public class NestedClass3 {
    public static void main(String[] args) {
        Outer3 d = new Outer3();
        d.showMul();
    }
}
