package com.gentech.staticreturns;
class OddNoCount
{
    static  int count(int start , int end)
    {
        int countOdd=0;
        for(int i= start;i<=end ;i++)
        {
            if(i%2!=0)
                countOdd++;
        }
        return countOdd;
    }
}
public class StaticCountOfOddNumbers {
    public static void main(String[] args) {
        System.out.println(OddNoCount.count(1,500));
    }
}
