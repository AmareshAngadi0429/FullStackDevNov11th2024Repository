package com.gentech.staticreturns;
class SumLongOfArray
{
    static long sumLong(long[] arr)
    {
        long sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return  sum;
    }

}
public class SumOFAllElementsInGivenLongArray {
    public static void main(String[] args) {
        System.out.println( SumLongOfArray.sumLong(new long[]  {1232312,2324442,34242}));
    }
}
