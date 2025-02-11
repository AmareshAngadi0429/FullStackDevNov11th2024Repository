package com.gentech.returnmethods;

class FirstRow2DArray{

    int[] row(byte[][] arr,int rowNo)
    {
        int[] res = new int[arr[rowNo].length];
        for(int i=0;i<arr[rowNo].length;i++)
        {
            res[i] = arr[rowNo][i];
        }
        return res;
    }
}

public class Returns1stRowOf2DByteArray {
    public static void main(String[] args) {
        FirstRow2DArray f = new FirstRow2DArray();
        int[] resultRow =  f.row(new byte[][]{{1,2,3},{4,5,6},{7,8,9}},1);
        for(int i =0;i<resultRow.length;i++)
        {
            System.out.printf("%-4d",resultRow[i]);
        }
    }
}
