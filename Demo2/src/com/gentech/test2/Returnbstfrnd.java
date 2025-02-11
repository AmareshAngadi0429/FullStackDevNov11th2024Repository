package com.gentech.test2;
class Return14
{
    String[] ret14()
    {
        String[] s = {"Amaresh","Suresh","ravi","santu"};
        return s;
    }
}
public class Returnbstfrnd {
    public static void main(String[] args) {
        Return14 r = new Return14();
        String[] re = r.ret14();
        for (int i=0;i<re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
