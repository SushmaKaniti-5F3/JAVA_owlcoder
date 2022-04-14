package day1;

import java.util.Scanner;

public class Array_2D {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int r,c;
		r=ob.nextInt();
		c=ob.nextInt();
		int a[][]=new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		ob.close();
	}

}

/*
  Output:
		2
		3
		1 2 3
		4 5 6
		1 2 3 
		4 5 6 
 */