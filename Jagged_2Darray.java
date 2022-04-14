package day1;

import java.util.Scanner;

public class Jagged_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[5][];
		x[0]=new int[4];
		x[1]=new int[2];
		x[2]=new int[1];
		x[3]=new int[3];
		x[4]=new int[1];
		Scanner ob=new Scanner(System.in);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			x[i][j]=ob.nextInt();
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}

}
/*Input:
	4 1 2 6
	1 23
	1
	5 5 6
	1

* OUTPUT:
	4 1 2 6 
	1 23 
	1 
	5 5 6 
	1 
*/