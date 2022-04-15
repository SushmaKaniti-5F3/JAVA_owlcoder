package day2;

public class Class_intro {

	int x;
	int y;
	public	void setx()
	{
		x=12;
	}
	public	void sety()
	{
		y=42;
	}
	public int getx()
	{
		return x;
	}
	public	int gety()
	{
		return y;
	}
	public static void main(String[] args) {
		Class_intro c=new Class_intro();
		System.out.println(c.getx());
		System.out.println(c.gety());
		c.setx();
		c.sety();
		System.out.println(c.getx());
		System.out.println(c.gety());
	}

}
