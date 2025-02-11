package com.gentech.practise;

public class MatrixRotate {

	public static void main(String[] args) {
		int a=4;
		int b=4;
		int ar [][] = {{1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}};
		rotat(a,b,ar);

	}
	public static void rotat(int m ,int n,int x[][])
	{
		
		int row =0;
		int col=0;
		int prev,curr;
		
		while(row<m && col<n)
		{   
			if (row + 1 == m || col + 1 == n)
                break;
			prev = x[row+1][col];
			for(int i=col;i<n;i++)
			{
				curr = x[row][i];
				x[row][i]=prev;
				prev = curr;
			}
			row++;	
			for(int i=row;i<m;i++)
			{
				curr=x[i][n-1];
				x[i][n-1]=prev;
				prev =curr;
			}
			n--;
			if(row<m)
			{
				for(int k= n-1;k>=col;k--)
				{
					curr = x[m-1][k];
					x[m-1][k]=prev;
					prev = curr;
				}
			}
			m--;
			if(col<n)
			{
				for(int g= m-1;g>=row;g--)
				{
					curr = x[g][col];
					x[g][col]=prev;
					prev = curr;
				}
			}
			col++;
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.print(x[i][j]+"  ");
			}
			System.out.println();
		}
	}

}

