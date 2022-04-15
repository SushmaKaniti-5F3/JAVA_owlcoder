package day2;

public class Static_blocks {
	static
	{
		System.out.println("First Static Block");
	}
	void sample()
	{
		System.out.println("Class Member\n"+s);
	}
	public static void main(String[] args) {
		Static_blocks s=new Static_blocks();
		s.sample();
		System.out.println("Main method");
	}
	static
	{
		System.out.println("Second Static block");
	}
	static int s=12;
}
