package day1;

import java.util.Scanner;

public class Working_with_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n;
		System.out.println("Enter range:");
		n=ob.nextInt();
		String x[]=new String[n];
		System.out.println("Enter words:");
		for(int i=0;i<n;i++)
		{
			x[i]=ob.next();			
		}
		System.out.println("Your words:");
		for(String i : x)
		{
			System.out.print(i+" ");
		}
		ob.close();
	}

}
/*
Output:
	Enter range:
	5
	Enter words:
	ant ban cab dab egg
	Your words:
	ant ban cab dab egg 
*/