package com.gentech.test2;
class Return9
{
    double ret9(int start,int end)
    {
        int count =0;
        for(int i=start;i<=end;i++)
        {
            count++;
        }
        double sum =0;
        for(int i=start;i<=end;i++)
        {
            sum+=i;
        }
        double avg = sum/count;
        return  avg;
    }
}
public class ReturnAvg {
    public static void main(String[] args) {
        Return9 r = new Return9();
        double re = r.ret9(1,10);
        System.out.println(re);
    }
}
