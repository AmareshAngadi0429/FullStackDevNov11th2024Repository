package com.gentech.returnmethods;


class Sum
{
    int sumno(int start ,int end)
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
        Sum s = new Sum();
        int v = s.sumno(10,20);
        System.out.println("sum of no. : "+v);
    }


}
