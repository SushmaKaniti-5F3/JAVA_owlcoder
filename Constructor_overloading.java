package day2;

public class Constructor_overloading {
	int l,b,h;
	public Constructor_overloading()
	{
		System.out.println("Default Constructor");
		l=b=h=0;
	}
	public Constructor_overloading(int n)
	{
		System.out.println("Parameterized with only one Argument:");
		l=b=h=n;
	}
	public Constructor_overloading(int l,int b,int h)
	{
		System.out.println("Parameterized with three Argument:");
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public int volume()
	{
		return l*b*h;
	}
	
	public static void main(String[] args) {
		Constructor_overloading ob=new Constructor_overloading();
		System.out.println(ob.volume());
		Constructor_overloading ob1=new Constructor_overloading(3);
		System.out.println(ob1.volume());
		Constructor_overloading ob2=new Constructor_overloading(4,5,6);
		System.out.println(ob2.volume());
	}

}
