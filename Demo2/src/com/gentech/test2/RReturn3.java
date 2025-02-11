package com.gentech.test2;

class Return3
{
    byte[] Return()
    {
        byte[] b={1,2,3,4,5};
        return b;
    }
}
public class RReturn3 {
    public static void main(String[] args) {
        Return3 r = new Return3();
        byte[] re = r.Return();
        for (int i=0;i<re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
