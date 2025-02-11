package com.gentech.test2;
class Return6
{
    String[] ret6(String[] s)
    {
        return  s;
    }
}
public class ReturnStr1darray {
    public static void main(String[] args) {
        Return6 r = new Return6();
        String re[] = r.ret6(new String[] {"Amaresh","Ganesh","Santosh"});
        for(int i=0;i<re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
