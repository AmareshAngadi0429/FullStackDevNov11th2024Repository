package com.gentech.test2;

class Sum
{
    int sum(int start,int end)
    {
        int sum=0;
        for(int i=start;i<=end ;i++)
        {
            sum+=i;
        }
        return  sum;
    }
}
public class ReturnSum {
    public static void main(String[] args) {
        Sum s = new Sum();
        int re = s.sum(1,5);
        System.out.println("Sum : "+re);
    }
}
