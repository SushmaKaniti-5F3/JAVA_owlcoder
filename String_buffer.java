package day2;

public class String_buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb);
		sb.append(" Sushma");
		System.out.println(sb);
		sb.insert(0,"hello..");
		System.out.println(sb);
		sb.setCharAt(0, 'i');
		System.out.println(sb);
		
	}

}
