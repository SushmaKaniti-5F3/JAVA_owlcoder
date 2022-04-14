package day1;

import java.util.Scanner;

public class Scanner_read_studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String sname,rno;
		int marks;
		System.out.println("name:");
		sname=ob.nextLine();
		System.out.println("marks:");
		marks=ob.nextInt();
		System.out.println("Roll no:");
		rno=ob.next();
		//marks=ob.nextInt();
		System.out.println(sname+"\n"+rno+"\n"+marks);
		ob.close();
	}
}
/* Scanner class has one problem i.e.;
 * after reading an integer value, we can't read string.nextLine().
   so we need to call a dummy nextLine() to resolve this problem */
/*
 * Scanner ob=new Scanner(System.in);
		String sname,rno;
		int marks;
		marks=ob.nextInt();			
		ob.nextLine();
		sname=ob.nextLine();
		rno=ob.next();
		System.out.println(sname+"\n"+rno+"\n"+marks);
 *		ob.close();
 */
/*
  Output:
		name:
		Kavya Sushma Mounika
		marks:
		95
		Roll no:
		19A9105F3
		Kavya Sushma Mounika
		19A9105F3
		95
*/