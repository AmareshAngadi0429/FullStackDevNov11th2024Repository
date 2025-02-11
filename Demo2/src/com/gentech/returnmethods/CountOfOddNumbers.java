package com.gentech.returnmethods;

class OddNoCount
{
    int count(int start , int end)
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

public class CountOfOddNumbers {
    public static void main(String[] args) {
        OddNoCount o = new OddNoCount();
        System.out.println("count of the odd numbers is "+o.count(1,500));
    }
}
