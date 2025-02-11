package com.gentech.test2;
class Return21
{
    String ret21( )
    {
        String [] s ={"apple","mango","orange"};
        String a =s[0];
        return a;
    }
}
public class Return1stElement {
    public static void main(String[] args) {
        Return21 r = new Return21();
        String re = r.ret21();
        System.out.println(re);
    }
}
