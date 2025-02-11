package com.gentech.staticreturns;
class Sum
{
    static  int sumNo(int start ,int end)
    {
        int sum = 0;
        for (int i=start;i<=end; i++)
        {
            sum += i;
        }
        return  sum;
    }
}
public class SumOfNoBtw10To100 {
    public static void main(String[] args) {
        System.out.println(Sum.sumNo(10,200));
    }
}

