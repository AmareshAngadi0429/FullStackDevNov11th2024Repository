package com.gentech.staticreturns;

class FirstRow2DArray{

    static byte[] row(byte[][] arr,int rowNo)
    {
        byte[] res = new byte[arr[rowNo].length];
        for(int i=0;i<arr[rowNo].length;i++)
        {
            res[i] = arr[rowNo][i];
        }
        return res;
    }
}
public class StaticReturns1stRowOf2DByteArray {
    public static void main(String[] args) {
        byte[] res = FirstRow2DArray.row(new byte[][] {{1,2,3},{4,5,6},{7,8,9}},1);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
