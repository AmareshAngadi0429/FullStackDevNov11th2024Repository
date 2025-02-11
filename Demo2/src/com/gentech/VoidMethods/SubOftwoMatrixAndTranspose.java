package com.gentech.VoidMethods;

class SubAndTranspose
{
    void subTwoMat(int[][] a , int[][] b)
    {

        if((a.length==b.length) && (a[0].length == b[0].length) )
        {
            int[][] transpose = new int[a.length][a[0].length];
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    transpose[i][j]= a[i][j] - b[i][j];
                }
            }
            for(int i=0;i<transpose[0].length;i++)
            {
                for(int j=0;j<transpose.length;j++)
                {
                    System.out.printf("%-5d",transpose[j][i]);
                }
                System.out.println();
            }

        }
    }
}

public class SubOftwoMatrixAndTranspose {
    public static void main(String[] args) {
        SubAndTranspose s = new SubAndTranspose();
        s.subTwoMat(new int[][] {{1,2,3,4},{4,5,6,4},{7,8,9,4}},new int[][]{{7,8,9,4},{4,5,6,4},{1,2,3,4}});
    }
}
