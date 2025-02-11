package com.gentech.test3;
class Tes41
{
    static
    {
        byte[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        byte[][] res = new byte[b.length][b[0].length];
        for(int i =0;i < b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                res[i][j] = b[j][i];

            }
        }
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
public class Test34 {
    public static void main(String[] args) {
        Tes41 t = new Tes41();
    }
}
