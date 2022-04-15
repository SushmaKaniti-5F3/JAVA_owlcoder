package day2;

public class Count_of_LowerUpperDigitsSpecialChars {

	public static void main(String[] args) {
		String s1="abc123#$%A5Z";
		int upper=0,lower=0,number=0,special=0;
		char ch[]=s1.toCharArray();
		//Using Unicode value 
		for(int i=0;i<ch.length;i++)
		{
			 if (ch[i]>= 'A' && ch[i]<= 'Z')
	                upper++;
	            else if (ch[i] >= 'a' && ch[i] <= 'z')
	                lower++;
	            else if (ch[i] >= '0' && ch[i] <= '9')
	                number++;
	            else
	                special++;
		}
		System.out.println("Count of lower,upper,number,special: ");
		System.out.println(lower+" "+upper+" "+number+" "+special);
		
		//Using predefined methods
		int u=0,l=0,n=0,s=0;
		System.out.println();
		for(int i=0;i<ch.length;i++)
		{
			 if (Character.isUpperCase(ch[i]))
	                u++;
	            else if (Character.isLowerCase(ch[i]))
	                l++;
	            else if (Character.isDigit(ch[i]))
	                n++;
	            else
	                s++;
		}
		System.out.println("Count of lower,upper,number,special: ");
		System.out.println(l+" "+u+" "+n+" "+s);
	}

}

/*
	OUTPUT:
	------
		Count of lower,upper,number,special: 
		3 2 4 3
*/
