package com.gentech.recursion;
class Count
{
    static int co(int n)
    {
        if(n/10==0)
        {
            return 1;
        }
        return 1+co(n/10);
    }
}
public class CountOfDigits {
    public static void main(String[] args) {
        System.out.println(Count.co(1234567890));
    }
}
