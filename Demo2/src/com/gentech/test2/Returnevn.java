package com.gentech.test2;
class Return13
{
    int[] ret13(int start, int end)
    {
        int count =0;
        for(int i = start;i<=end ;i++)
        {
            if(i%2==0)
            {
                count++;
            }

        }
        int k=0;
        int[] x = new int[count];
        for(int i = start;i<=end ;i++)
        {
            if(i%2==0)
            {
                x[k]=i;
                k++;
            }

        }
        return x;
    }
}
public class Returnevn {
    public static void main(String[] args) {
        Return13 r = new Return13();
        int[] re = r.ret13(10,20);
        for (int i=0 ;i<re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
