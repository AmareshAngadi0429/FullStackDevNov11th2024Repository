package com.gentech.VoidMethods;

class  Mul
{
    void mul(int[] a, int[] b) {
        if (a.length == b.length)
        {
            for (int j = 0; j < b.length; j++) {
                int res = a[j] * b[j];
                System.out.print(res + " ");
            }
        }
        else
        {
            System.out.println("Not Possible");
        }
    }
}

public class MulOfTwoOneDArray {
    public static void main(String[] args) {
        Mul m = new Mul();
        m.mul(new int[]  {1,2,3},new int[] {4,5,6});

    }
}
