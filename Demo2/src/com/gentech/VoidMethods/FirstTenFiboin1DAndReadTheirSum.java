package com.gentech.VoidMethods;

class First10Fibo
{
    void Fibo(int n)
    {
        int[] arr = new int[n];
        int sum =0;
        int fn =0;int sn =1;
        arr[0]=fn;
        arr[1]=sn;
        for(int i=2;i<n;i++)
        {
            int tn = fn+sn;
            arr[i]= tn;
            fn=sn;
            sn=tn;
        }
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of first 10 fibo no. is: "+ sum);

    }
}

public class FirstTenFiboin1DAndReadTheirSum {
    public static void main(String[] args) {
        First10Fibo f = new First10Fibo();
        f.Fibo(10);
    }
}
