package com.gentech.staticreturns;
class MatrixAddition
{
    static int[][] addition(int[][] a, int[][] b)
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
public class StaticMatrixAdditionResult {
    public static void main(String[] args) {
        int[][] re = MatrixAddition.addition(new int[][]{{1,2,3},{1,2,3},{1,2,3}},new int[][] {{1,2,3},{1,2,3},{1,2,3}});
        for(int i=0;i<re.length;i++)
        {
            for(int j=0;j<re[i].length;j++)
            {
                System.out.print(re[i][j]+" ");
            }
            System.out.println();
        }
    }
}
