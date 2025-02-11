package com.gentech.test2;
class Return7
{
    char[] ret7()
    {
        char ch[] = {'A','B','C','D'};
        return ch;
    }
}
public class Returncharidarr {
    public static void main(String[] args) {
        Return7 r = new Return7();
        char[] re = r.ret7();
        for(int i=0;i<re.length;i++)
        {
            System.out.println(re[i]);
        }
    }
}
