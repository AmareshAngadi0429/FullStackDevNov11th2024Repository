package com.gentech.recursion;
class Rev
{
    static void rev(int n)
    {
        if(n==0) {
            return;
        }
        System.out.print(n%10);
        rev(n/10);



    }
}
public class ReverseNo {
    public static void main(String[] args) {
        Rev.rev(12345678);
    }
}
