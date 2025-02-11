package com.gentech.VoidMethods;

class Add2MatandFindSumOf2ndRow
{
    void addTwoMat(int[][] a , int[][] b)
    {

        if((a.length==b.length) && (a[0].length == b[0].length) ) {
            int sum =0;
            int[][] result = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                    if(i==1)
                    {
                        sum+=result[i][j];
                    }
                }
            }
            System.out.println("Sum of 2nd row elements is: "+ sum);

        }
        else
        {
            System.out.println("not possible");
        }
    }
}
public class AddTwoMatrixAndReadSumOfSecondRowEle {
    public static void main(String[] args) {
        Add2MatandFindSumOf2ndRow a = new Add2MatandFindSumOf2ndRow();
        a.addTwoMat(new int[][] {{3,3},{4,4}},new int[][]{{3,3},{4,4}});

    }

}
