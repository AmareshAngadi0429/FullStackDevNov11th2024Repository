package com.gentech.VoidMethods;

class Prime50To100
{
    void Prime(int start, int end)
    {
        for(int i = start;i<=end;i++)
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
                System.out.println(i+" ");
            }


        }
    }
}

public class PrimeBtw50To100 {
    public static void main(String[] args) {
        Prime50To100 p = new Prime50To100();
        p.Prime(50,100);

    }
}
