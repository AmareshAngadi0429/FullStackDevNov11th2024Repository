package com.gentech.recursion;
class Power
{
    static int pow(int base , int exponent)
    {
        if(exponent ==1) {
            return base;
        }
        return base * pow(base,exponent-1);
    }
}
public class PowerOfANo {
    public static void main(String[] args) {
        System.out.println(Power.pow(3,4));
    }
}
