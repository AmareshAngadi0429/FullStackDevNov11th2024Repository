package com.gentech.stringdemo;
class CharLen
{
    static void mtd(String s)
    {
        char[] ch = s.toCharArray();
        int count = 0;
        for(int ele :ch)
        {
            count++;
        }
        System.out.println("count of char in string "+ count);
    }
}
public class NoOfCharsWithoutUsingLengthMtd {
    public static void main(String[] args) {
        CharLen.mtd("BENGALURU");
    }
}
