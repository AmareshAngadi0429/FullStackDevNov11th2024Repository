package com.gentech.recursion;
import  java.math.*;
class BinToDecc
{
    static double bin(int b ,int n )
    {
        if(b/10==0)
        {
            return b%10 *Math.pow(2,n);
        }
        return b%10 * Math.pow(2,n)+bin(b/10,n+1);
    }
}
public class BinToDec {
    public static void main(String[] args) {
        System.out.println(BinToDecc.bin(11,0));
    }
}
