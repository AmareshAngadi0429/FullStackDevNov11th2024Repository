package com.gentech.recursion;
class DecToBinn
{
    static String getBin(int n,String bin)
    {
        if(n==0)
        {
            return bin;
        }
        return getBin(n/2,n%2+bin);
    }
}
public class DecToBin {
    public static void main(String[] args) {
        System.out.println(DecToBinn.getBin(30," "));
    }
}
