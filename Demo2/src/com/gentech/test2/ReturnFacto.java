package com.gentech.test2;
class Facto
{
    int fact(int n)
    {
        int f = 1;
        for(int i=n;i>=1;i--)
        {
            f = f*i;
        }
        return f;
    }
}
public class ReturnFacto {
    public static void main(String[] args) {
        Facto fe = new Facto();
        int re = fe.fact(4);
        System.out.println("factorial of given no is "+re);
    }
}

