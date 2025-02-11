package com.gentech.staticreturns;

class NoDivBy10Btw500To200
{


    static int[] NoBtwDivBy10(int start,int end)
    {
        int count =0;
        for(int i=start;i>=end;i--)
        {
            if(i%10==0)
                count++;
        }
        int[] res = new int[count];
        int k=0;
        for(int i=start;i>=end;i--)
        {
            if(i%10==0) {
                res[k] = i;
                k++;
            }
        }
        return res;
    }
}
public class StaticNoBtw500To200DivBy10 {
    public static void main(String[] args) {
        int[] re = NoDivBy10Btw500To200.NoBtwDivBy10(500,200);
        for (int i=0;i<re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
