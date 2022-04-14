package day1;

import java.util.Scanner;

public class Even_odd_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n,j=0,k=0;
		n=ob.nextInt();
		int a[]=new int[n];
		int even[]=new int[n];
		int odd[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
			if(a[i]%2==0)
			{
				even[j]=a[i];
				j++;
			}
			else
			{
				odd[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0;i<k;i++)
		{	
			System.out.print(odd[i]+" ");
		}
		ob.close();

	}

}
