package com.gentech.recursion;
class Sum
{
    static int sum(int n)
    {
        if(n/10==0) {
            return n % 10;
        }
        return n%10 +sum(n/10);
    }
}
public class SumOfDigiOfANumber {
    public static void main(String[] args) {
        System.out.println(Sum.sum(123));
    }
}
