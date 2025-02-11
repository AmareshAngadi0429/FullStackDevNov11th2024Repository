package com.gentech.test2;
class Return16
{
    int[][] ret16()
    {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        return a;
    }
}
public class Return2DIntArray {
    public static void main(String[] args) {
        Return16 r = new Return16();
        int[][] re = r.ret16();
        for (int i=0;i<re.length;i++)
        {
            for (int j=0;j<re[i].length;j++)
            {
                System.out.printf("%-3d",re[i][j]);
            }
            System.out.println();
        }
    }
}
