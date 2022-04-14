package day1;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int p,t,r;
		System.out.println("Enter p,t,r values: ");
		p=obj.nextInt();
		t=obj.nextInt();
		r=obj.nextInt();
		float I;
		I=(p*t*r)/100;
		System.out.println("Simple Interest: "+I);
		obj.close();
	}

}

/* OUTPUT:
 *  Enter p,t,r values:
 *  100000
 *  12
 *  2
 *  Simple Interest: 24000.0 
 */

