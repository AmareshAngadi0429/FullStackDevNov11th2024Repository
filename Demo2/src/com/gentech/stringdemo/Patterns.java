package com.gentech.stringdemo;
class Pattern
{
    static void mtd1(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j = 0;j<=i;j++)
            {
                char ch = s.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void mtd2(String s)
    {
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j = 0;j<=i;j++)
            {
                char ch = s.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void mtd3(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j = 0;j<=i;j++)
            {
                char ch = s.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        for(int i=s.length()-2;i>=0;i--)
        {
            for(int j = 0;j<=i;j++)
            {
                char ch = s.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
public class Patterns {
    public static void main(String[] args) {
            Pattern.mtd1("PROGRAM");
            System.out.println();
            Pattern.mtd2("PROGRAM");
            System.out.println();
            Pattern.mtd3("PROGRAM");
    }
}
