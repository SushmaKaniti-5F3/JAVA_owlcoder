package day1;

import java.util.Scanner;

public class Array_target_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n,count=0,k;
		n=ob.nextInt();						//reading range of array
		k=ob.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();				//reading elements in an array 
			if(a[i]==k)
				count++;
		}
		System.out.println(count);
		ob.close();
	}

}
/* Output:
	   5                //range
	   2				//target
	   1 2 3 4 5		//array elements
	   1 				//count
 */
