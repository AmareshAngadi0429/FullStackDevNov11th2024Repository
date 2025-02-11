package com.gentech.nestedclass;
class Outer4
{
    static int a;
    static int b;
    void showMul()
    {
        Inner4.c=2;
        Inner4 i = new Inner4();
        i.d=5;
        System.out.println(i.mul());
    }
    public class Inner4{

         static int d;
         static int c;

        public static int add()
        {
            return  c+d;
        }
        public int mul()
        {
            return  a*b;
        }
    }
}
public class NestedClass4 {
    public static void main(String[] args) {
        Outer4 d = new Outer4();
        d.showMul();
        Outer4.Inner4.c =5;
       Outer4.Inner4.d=3;
        System.out.println(Outer4.Inner4.add());


    }


}
