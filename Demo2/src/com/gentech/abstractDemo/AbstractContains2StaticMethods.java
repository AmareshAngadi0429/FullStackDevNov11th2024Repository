package com.gentech.abstractDemo;
abstract  class Parent3
{
    static double count(int start , int end)
    {
        if(start == end)
        {
            return 1;
        }
        else {
            return 1+ count(start+1,end);
        }
    }
    static double sum(int start , int end)
    {
        if(start == end) {
            return start;
        }
        else {
            return start + sum(start+1,end);
        }
    }
    abstract double avg(int start, int end);
}
class Base3 extends Parent3
{
    double sum;
    double count;
    @Override
    double avg(int start, int end) {
        sum = sum(start ,end);
        count = count(start,end);
        return sum/count;
    }
}
public class AbstractContains2StaticMethods {
    public static void main(String[] args) {
        Base3 b = new Base3();
        System.out.println("sum of 1 to 10 "+Base3.sum(1,10));
        System.out.println("count of 1 to 10 "+Base3.count(1,10));
        System.out.println("Avg of 1 to 10 "+b.avg(1,10));
    }

}
