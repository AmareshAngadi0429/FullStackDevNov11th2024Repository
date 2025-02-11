package com.gentech.test2;
class Return8
{
    int ret8(int n)
    {
        int cube = n*n*n;
        return cube;
    }
}
public class Returncube {
    public static void main(String[] args) {
        Return8 r = new Return8();
        int res = r.ret8(3);
        System.out.println(res);
    }
}
