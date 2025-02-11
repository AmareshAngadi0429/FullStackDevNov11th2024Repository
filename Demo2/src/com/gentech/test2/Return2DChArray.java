package com.gentech.test2;
class Return22
{
    char[][] ret22()
    {
        char[][] ch ={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        return ch;
    }
}
public class Return2DChArray {
    public static void main(String[] args) {
        Return22 r = new Return22();
        char[][] re = r.ret22();
        for (int i=0;i<re.length;i++)
        {
            for (int j=0;j<re[i].length;j++)
            {
                System.out.print(re[i][j]+" ");
            }
            System.out.println();
        }
    }
}
