package com.gentech.staticreturns;
class Table
{
    static int[] table(int n)
    {
        int[] tab = new int[10];
        int k=0;
        for(int i=1;i<=10;i++)
        {
            tab[k] = n * i;
            k++;
        }
        return tab;
    }
}
public class StaticTableMain {
    public static void main(String[] args) {
        int[] re = Table.table(7);
        for(int i=1;i<re.length;i++)
        {
            System.out.println(re[i]);
        }
    }
}
