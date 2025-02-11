package com.gentech.staticreturns;
class TransposeMatrix
{
    static int[][] transpose(int[][] arr)
    {
        int[][] trans = new int[arr[0].length][arr.length];
        for(int i=0 ;i < arr[0].length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                trans[i][j]=arr[j][i];
            }
        }
        return trans;
    }

}
public class StaticReturnTransposeMatrix {
    public static void main(String[] args) {
        int[][] re =TransposeMatrix.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for(int i=0 ;i < re.length;i++)
        {
            for(int j=0;j<re[0].length;j++)
            {
                System.out.printf("%-4d",re[i][j]);
            }
            System.out.println();
        }
    }
}
