package com.gentech.returnmethods;

class MatrixAddition
{
    int[][] addition(int[][] a, int[][] b)
    {
        int[][] c =new int[a.length][a[0].length];
        if((a.length==b.length)&&(a[0].length==b[0].length))
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    c[i][j] = a[i][j]+b[i][j];
                }
            }
        }
        else
        {
            System.out.println("not possible");
        }
        return c;
    }

}

public class MatrixAdditionResult {
    public static void main(String[] args) {
        MatrixAddition m = new MatrixAddition();
       int[][] result = m.addition(new int[][]{{1,2,3},{1,2,3},{1,2,3}},new int[][] {{1,2,3},{1,2,3},{1,2,3}});
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.printf("%-4d",result[i][j]);
            }
            System.out.println();
        }
    }
}
