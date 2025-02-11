package com.gentech.returnmethods;

class EvenNo
{

    int[] evnNoBtw(int start, int end)
    {
        int count = 0;
        for(int i=40;i>=20;i--)
        {
            if(i%2==0)
                count++;
        }
        int[] evn = new int[count];
        int k=0;
        for(int i=40;i>=20;i--)
        {
            if(i%2==0)
            {
                evn[k]=i;
                k++;
            }

        }
        return evn;
    }

}
public class EvenNoFrom40To20 {
    public static void main(String[] args) {
        EvenNo e = new EvenNo();
        int[] res = e.evnNoBtw(40,20);
        for(int i=0;i< res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

}
