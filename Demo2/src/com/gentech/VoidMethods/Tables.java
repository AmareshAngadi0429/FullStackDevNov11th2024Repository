package com.gentech.VoidMethods;

class OneToTwentyTable
{
    void table(int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            for(int j=1;j<=10;j++)
            {
                int t = i * j;
                System.out.println(i+" x "+j+" = "+t);
            }
            System.out.println();
        }
    }
}

public class Tables {
    public static void main(String[] args) {
        OneToTwentyTable a = new OneToTwentyTable();
        a.table(1,20);
    }
}
