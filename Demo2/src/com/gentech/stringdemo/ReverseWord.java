package com.gentech.stringdemo;
class Word
{
    static void mtd(String s)
    {
        String[] s1 = s.split(" ");
        for (int i=0;i<s1.length;i++)
        {
            char[] ch = s1[i].toCharArray();
            for (int j= ch.length-1;j>=0;j--)
            {
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }
}
public class ReverseWord {
    public static void main(String[] args) {
        Word.mtd("Bengaluru is garden city");
    }
}
