package com.gentech.stringdemo;
class Words
{
    static void mtd(String s)
    {
        String[] s1 = s.split(" ");
        int count = 0;
        for(int i=0;i<s1.length;i++)
        {
            count++;
        }
        System.out.println("No of words in tha string : "+count);
    }
}
public class NoOfWords {
    public static void main(String[] args) {
        Words.mtd("The temple is at top of the hill");
    }
}
