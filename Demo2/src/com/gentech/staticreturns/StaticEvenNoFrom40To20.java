package com.gentech.staticreturns;
class EvenNo
{

    static int[] evnNoBtw(int start, int end)
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
public class StaticEvenNoFrom40To20 {
    public static void main(String[] args) {
        int[] re = EvenNo.evnNoBtw(40,20);
        for(int i=0;i<re.length;i++)
        {
            System.out.println(re[i]);
        }
    }


}
