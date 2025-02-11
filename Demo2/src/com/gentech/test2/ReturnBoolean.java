package com.gentech.test2;
class Return12
{
    boolean[] ret12()
    {
        boolean[] x = {true,false,true};
        return x;
    }
}
public class ReturnBoolean {
    public static void main(String[] args) {
        Return12 r = new Return12();
        boolean[] re = r.ret12();
        for (int i=0 ;i<re.length;i++)
        {
            System.out.println(re[i]);
        }
    }
}
