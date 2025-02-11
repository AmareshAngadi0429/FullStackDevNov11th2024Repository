package com.gentech.test2;
class Return23
{
    char[] ret23()
    {
        int[] x = {1,2,3,4,5};
        char[] ch = new char[x.length];
        for(int i=0;i<x.length;i++)
        {
            ch[i] = (char) (x[i]+'0');
        }
        return ch;
    }
}
public class ReturnCharArrayFromIntArray {
    public static void main(String[] args) {
        Return23 r =new Return23();
        char[] re = r.ret23();
        for(int i=0;i<re.length;i++)
        {
            System.out.println(re[i]);
        }
    }
}
