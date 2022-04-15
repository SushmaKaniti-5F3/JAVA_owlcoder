package day2;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Learning java is very easy and python is also very easy");
		System.out.println(s1.length());		//string length
		
		//string concat
		s1=s1.concat(" in Aditya");				
		System.out.println(s1);
		
		//String lower and upper
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//split
		String words[]=s1.split(" ");
		for(String word:words)
			System.out.println(word+" ");
		
		//equals
		String s2=new String("KANITI");
		String s3=new String("kaniti");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//String replace
		System.out.println(s1.replace('a', 'Z'));
		System.out.println(s1.replace("is","was"));
		System.out.println(s1.replaceFirst("is","was"));
		String s4="in Aditya";
		System.out.println(s4.length()-s4.replace('a',' ').length());
		
		//reading string by char to char
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+"  ");
		}

		//index
		System.out.println();
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		
		//substring
		System.out.println(s1.substring(0,5));
		
		//convert string to array
		char x[]=s1.toCharArray();
		for(char ch:x)
			System.out.print(ch+" ");
		
		//convert array to string
		String s=new String(x);
		System.out.println();
		System.out.println(s);
		

		

	}

}
