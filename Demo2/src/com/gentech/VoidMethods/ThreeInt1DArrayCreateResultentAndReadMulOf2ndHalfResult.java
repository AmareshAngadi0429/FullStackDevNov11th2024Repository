package com.gentech.VoidMethods;
class Mul3
{
    void mul3(int[] a,int[] b,int[]c)
    {

        int[] res = new int[a.length+b.length+c.length];
        int k =0;
        for(int i=0;i<a.length;i++)
        {
            res[k] = a[i];
            k++;
        }
        for(int i=0;i<b.length;i++)
        {
            res[k] = b[i];
            k++;
        }
        for(int i=0;i<c.length;i++)
        {
            res[k] = c[i];
            k++;
        }
        int mulResult = 1;
        for(int i=res.length/2;i<res.length;i++)
        {
            mulResult *= res[i];
        }
        System.out.println("Resultant of 3 Int 1D Array And MUl 2nd HalfResult: "+mulResult);


    }
}
public class ThreeInt1DArrayCreateResultentAndReadMulOf2ndHalfResult {
    public static void main(String[] args) {
        Mul3 m = new Mul3();
        m.mul3(new int[]{1,2,3},new int[]{4,5,6},new int[]{1,2,3});
    }
}
