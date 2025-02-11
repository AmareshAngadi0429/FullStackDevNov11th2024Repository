package com.gentech.Inheritance;
class CountOfEven
{
    int countOfEvenNo(int start,int end)
    {
        if (end==start && end % 2 ==0)
        {
            return 1;
        }
        if (end==start && end % 2 !=0)
        {
            return 0;
        }
        if (end % 2 !=0){
            return countOfEvenNo(start, end - 1);
        }
        
        return 1+ countOfEvenNo(start,end-1);
        
    }
}
class SumOfEvenNo extends CountOfEven
{
    SumOfEvenNo(int start,int end)
    {
        super.countOfEvenNo(start,end);
    }
    int sum(int start, int end)
    {

        if (end==start && end % 2 ==0)
        {
            return end;
        }
        if (end==start && end % 2 !=0)
        {
            return 0;
        }
        if (end % 2 !=0){
            return sum(start, end - 1);
        }

        return end+ sum(start,end-1);
    }

}
class Avg extends SumOfEvenNo
{
    int s;
    int c;
    Avg(int start,int end)
    {
        super(start,end);
        s = super.sum(start, end);
        c =super.countOfEvenNo(start,end);
    }
    void avg()
    {
        double av = s/c;
        System.out.println("avg of the given even numbers is "+av);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Avg a = new Avg(1,12);
        a.avg();
    }
}
