package com.gentech.test2;
class Return20
{
    int ret20(int[] arr)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
public class ReturnSumOfGinenArray {
    public static void main(String[] args) {
        Return20 r = new Return20();
        int re = r.ret20(new int[]{2,4,6,8,10});
        System.out.println(re);
    }
}
