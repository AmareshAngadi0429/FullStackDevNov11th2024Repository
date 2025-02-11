package com.gentech.returnmethods;

class DivisibleBy6
{
    int countNoBtw100To200DivisibleBy6(int start, int end)
    {
        int count =0;
        for(int i =start;i<=end; i++)
        {
            if(i%6==0)
            {
                count++;
            }
        }
        return count;
    }

}

public class CountOfNoBtw100To200DiviBy6 {
    public static void main(String[] args) {
        DivisibleBy6 d = new DivisibleBy6();
        int v = d.countNoBtw100To200DivisibleBy6(100,200);
        System.out.println("count : "+v);
    }
}
