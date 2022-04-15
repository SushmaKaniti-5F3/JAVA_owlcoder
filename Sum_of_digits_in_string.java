package day2;

public class Sum_of_digits_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		String s1="abc123#$%A5Z";
		char ch[]=s1.toCharArray();
		System.out.println();
		for(int i=0;i<ch.length;i++)
		{
			 if (ch[i]>=48 && ch[i]<=57)
			 {
				 int d = ch[i]-48; 
				 s=s+d;
			 }
		}
		System.out.println("Sum of numbers: ");
		System.out.println(s);
	}
}
/*
 	OUTPUT:
 	------
 		Sum of numbers: 
		11
 */

