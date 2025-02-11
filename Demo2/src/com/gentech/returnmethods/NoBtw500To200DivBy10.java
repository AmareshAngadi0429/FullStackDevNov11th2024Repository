package com.gentech.returnmethods;

class NoDivBy10Btw500To200
{


    int[] NoBtwDivBy10(int start,int end)
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

public class NoBtw500To200DivBy10 {
    public static void main(String[] args) {
        NoDivBy10Btw500To200 n= new NoDivBy10Btw500To200();
        int[] show = n.NoBtwDivBy10(500,200);
        for(int i=0;i<show.length;i++)
        {
            System.out.print(show[i]+" ");
        }
    }
}
