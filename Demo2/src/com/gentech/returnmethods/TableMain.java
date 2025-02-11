package com.gentech.returnmethods;

class Table
{
    int[] table(int n)
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
public class TableMain {
    public static void main(String[] args) {
        Table t = new Table();
        int[] res = t.table(7);
        for(int i=0;i<10;i++)
        {
            System.out.println(res[i]);
        }

    }
}
