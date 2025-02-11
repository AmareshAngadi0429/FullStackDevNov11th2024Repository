package com.gentech.returnmethods;
class TransposeMatrix
{
    int[][] transpose(int[][] arr)
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
public class ReturnsTransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix t = new TransposeMatrix();
        int[][] res = t.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for(int i=0 ;i < res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                System.out.printf("%-3d",res[i][j]);
            }
            System.out.println();
        }
    }

}
