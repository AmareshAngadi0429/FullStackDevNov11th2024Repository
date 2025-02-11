package com.gentech.recursion;
class Fibo
{

    static int[] fib(int x[],int k,int n, int fn,int sn)
    {
        if(n>0)
        {
            x[k]=fn;
            int tn =sn+fn;
            fn=sn;
            sn=tn;
           fib(x,k+1,n-1,fn,sn);

        }
        return x;

    }
}
public class FiboSeries {
    public static void main(String[] args) {
        int n=10;
       int[] y = Fibo.fib(new int[n],0,n,0,1);
       for(int i=0;i<y.length;i++)
       {
           System.out.println(y[i]);
       }

    }
}
