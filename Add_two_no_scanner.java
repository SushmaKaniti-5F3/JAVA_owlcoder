package day1;

import java.util.Scanner;

public class Add_two_no_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=ob.nextInt();
		System.out.println("Enter b value:");
		int b=ob.nextInt();
		System.out.println("sum of "+a+" and "+b+": \n"+(a+b));
		ob.close();
	}

}
