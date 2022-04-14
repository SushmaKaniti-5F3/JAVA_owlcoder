package day1;

import java.util.Scanner;

public class Left_Right_diagonal_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n;
		n=ob.nextInt();
		int k=n-1,left=0,right=0;
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{	
			left=left+a[i][i];
			right=right+a[i][k];
			k--;
																				
		}
		System.out.println(Math.abs(left-right));
		ob.close();
	}

}

/*
	OUTPUT:
			5			//range
			1 2 3 4 5	//array elements
			5 6 7 8 9 
			5 4 3 2 1
			4 5 6 4 5
			7 8 9 1 1
			13			//abs(left-right)
*/