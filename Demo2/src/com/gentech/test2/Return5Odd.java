package com.gentech.test2;
class return11
{
    int[] ret11()
    {
        int n =1;
        int i=0;
        int[] x = new int[5];
        while(i<x.length)
        {
            if(n%2!=0)
            {
                x[i]=n;
                i++;
            }
            n++;
        }
        return x;
    }
}
public class Return5Odd {
    public static void main(String[] args) {
        return11 r = new return11();
        int[] re = r.ret11();
        for(int i=0;i<re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
