package com.gentech.VoidMethods;

class RevOrdAndRead1stHalf
{
    void rev(char[] a)
    {
        int k=0;
        char[] b = new char[a.length];
        for(int i=a.length-1;i>=0;i-- )
        {
            b[k]=a[i];
            k++;
        }
        for(int i=0;i<=b.length/2;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
public class CharArrayIntoAnotherCharArrayInRevOrdAndRead1stHalf {
    public static void main(String[] args) {
        RevOrdAndRead1stHalf r = new RevOrdAndRead1stHalf();
        r.rev(new char[]{'A','B','C','D','E','F'});
    }
}
