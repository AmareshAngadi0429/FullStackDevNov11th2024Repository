package com.gentech.test2;
class Return10
{
    int ret10(int start, int end)
    {
        int count =0;
        for(int i=start;i<=end ;i++)
        {
            if(i%3==0)
            {
                count++;
            }
        }
        return  count;
    }
}
public class ReturnCountbtw40to80 {
    public static void main(String[] args) {
        Return10 r = new Return10();
        int re = r.ret10(40,80);
        System.out.println(re);
    }
}
