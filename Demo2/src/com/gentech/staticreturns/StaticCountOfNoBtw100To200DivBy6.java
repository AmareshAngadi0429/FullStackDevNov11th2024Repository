package com.gentech.staticreturns;
class DivBy6
{
    static int countNoBtw100To200DivisibleBy6(int start, int end)
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
public class StaticCountOfNoBtw100To200DivBy6 {
    public static void main(String[] args) {
        System.out.println(DivBy6.countNoBtw100To200DivisibleBy6(100,200));
    }

}
