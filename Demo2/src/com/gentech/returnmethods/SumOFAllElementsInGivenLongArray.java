package com.gentech.returnmethods;

class SumLongOfArray
{
    long sumLong(long[] arr)
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
        SumLongOfArray s = new SumLongOfArray();
        long v = s.sumLong(new long[] {1,2,3,4,5,6,7,8,9});
        System.out.println("Sum : "+ v);
    }
}
