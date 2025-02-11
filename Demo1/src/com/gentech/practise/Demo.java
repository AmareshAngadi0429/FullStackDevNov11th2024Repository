package com.gentech.practise;

public class Demo {

	public static void main(String[] args) {
		int a[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int b[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int c[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int d[][] = {{2,2,2},{2,2,2},{2,2,2}};
		
		int intermediateresult1[][] = multiply(a,b);
		if(intermediateresult1 == null)
		{
			System.out.println("not possible");
		}
		int intermediateresult2[][] = multiply(intermediateresult1,c);
		if(intermediateresult2 == null)
		{
			System.out.println("not possible");
		}
		int result[][] = multiply(intermediateresult2,d);
		PrintMatrix(result);
		
		

	}
	public static int[][] multiply(int x[][],int y[][])
	{
		if(x[0].length != y.length )
		{	
			return null;
		}
		int intmedres[][] = new int[x.length][y[0].length];
		for(int i = 0;i<x.length;i++)
		{	
			for(int j =0;j<y[0].length;j++)
			{	
				int sum =0;
				for(int k=0;k<x[0].length;k++)
				{
					sum+=x[i][k]*y[k][j];
				}
				intmedres[i][j]= sum;
			}
		}
		return intmedres;
	}
	public static void PrintMatrix(int finalresult[][])
	{
		for(int i=0;i<finalresult.length;i++)
		{
			for(int j=0;j<finalresult[0].length;j++)
			{
				System.out.print(finalresult[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
