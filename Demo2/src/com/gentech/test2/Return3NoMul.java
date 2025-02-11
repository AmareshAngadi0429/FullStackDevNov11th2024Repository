package com.gentech.test2;
class Return17
{
    int ret17 (int n1 ,int n2,int n3)
    {
        int mul = n1*n2*n3;
        return  mul;
    }
}
public class Return3NoMul {
    public static void main(String[] args) {
        Return17 r = new Return17();
        int re = r.ret17(1,2,3);
        System.out.println(re);
    }
}
