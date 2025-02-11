package com.gentech.VoidMethods;

class SumPrime1T0100
{
    void Sum(int start, int end)
    {
        int sum =0;
        for(int i = start;i<=end;i++)
        {
            if(i<=1)
            {
                continue;
            }
            else
            {
                int flag = 0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag = 1;
                    }
                }
                if(flag == 0)
                {
                    sum+=i;
                }
            }
        }
        System.out.println("Sum of prime no btw 1 to 100: " +sum);
    }
}

public class SumOfPrimeNoFrom1To100 {
    public static void main(String[] args) {
        SumPrime1T0100 s = new SumPrime1T0100();
        s.Sum(1,100);
        s.Sum(1,5);
    }
}
