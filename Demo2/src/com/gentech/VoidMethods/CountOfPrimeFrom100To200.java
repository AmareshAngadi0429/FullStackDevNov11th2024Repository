package com.gentech.VoidMethods;

class CountPrime100T0200
{
    void Count(int start, int end)
    {
        int count =0;
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
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                {
                    count ++;
                }
            }
        }
        System.out.println("Count of prime no btw 100 to 200: " +count);
    }
}

public class CountOfPrimeFrom100To200 {
    public static void main(String[] args) {
        CountPrime100T0200 Co = new CountPrime100T0200();
        Co.Count(100,200);
        Co.Count(1,10);
    }
}
