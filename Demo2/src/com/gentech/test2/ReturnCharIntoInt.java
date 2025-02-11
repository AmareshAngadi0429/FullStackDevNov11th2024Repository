package com.gentech.test2;
class Return24
{
    int[] ret24()
    {
        char[] ch = {'a','b','c','d'};
        int [] x = new int[ch.length];
        for(int i=0;i<x.length;i++)
        {
            x[i] = (int) (ch[i]);
        }
        return x;
    }
}
public class ReturnCharIntoInt {
    public static void main(String[] args) {
        Return24 r = new Return24();
        int[] re = r.ret24();
        for(int i=0;i<re.length;i++)
        {
            System.out.println(re[i]);
        }
    }
}
