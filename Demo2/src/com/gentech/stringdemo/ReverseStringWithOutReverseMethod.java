package com.gentech.stringdemo;
class Reverse
{
    static void revMtdUsingCharAt(String s)
    {
        char[] ch = new char[s.length()];
        for (int i=0;i<s.length();i++)
        {
            ch [i] = s.charAt(i);
        }
        String res = " ";
        for (int i=ch.length-1;i>=0;i--)
        {
            res += ch[i];
        }
        System.out.println(res);
    }


    static void revMtdUsingToCharArray(String s1)
    {
        char[] ch = s1.toCharArray();
        String res1 = " ";
        for (int i=ch.length-1;i>=0;i--)
        {
            res1 += ch[i];
        }
        System.out.println(res1);


    }

    static void revMtdUsingSubString(String s2)
    {
        for (int i=s2.length()-1;i>=0;i--)
        {
            System.out.print(s2.substring(i,i+1));
        }
    }

}
public class ReverseStringWithOutReverseMethod {
    public static void main(String[] args) {
        Reverse.revMtdUsingCharAt("BENGALURU");
        Reverse.revMtdUsingToCharArray("BENGALURU");
        Reverse.revMtdUsingSubString("BENGALURU");

    }
}
