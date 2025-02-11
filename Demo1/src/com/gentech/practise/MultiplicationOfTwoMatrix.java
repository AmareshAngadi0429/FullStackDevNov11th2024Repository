package com.gentech.practise;

public class MultiplicationOfTwoMatrix {
	
	public static void main(String args[])
	{
		
		int a1[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int a2[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int rr[][] = new int[a1[0].length][a2.length];
		int a3[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int r[][] = new int[rr.length][a3[0].length];
		m(a1,a2,rr);
		m(rr,a3,r);
		

	}
	public static void m(int m[][], int n[][], int o[][]) {
        if (m[0].length != n.length) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }
        mul(m, n, o);
    }
	public static void mul(int x[][],int y[][], int re1[][])
	{
		if(x[0].length == y.length )
		{	
			for(int i = 0;i<x.length;i++)
			{	
				for(int j =0;j<y[0].length;j++)
				{	
					int sum =0;
					for(int k=0;k<x[0].length;k++)
					{
						sum+=x[i][k]*y[k][j];
					}
					re1[i][j]= sum;
				
				}
			}
			for(int i=0;i<re1.length;i++)
			{
				for(int j=0;j<re1[0].length;j++)
				{
					System.out.print(re1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
		else
		{
			System.out.println("Not Possible");
		}
	}

}
