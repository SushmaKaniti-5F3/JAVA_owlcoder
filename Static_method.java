package day2;

public class Static_method {
	public static int area_rec(int l,int b )
	{
		return l*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area=Static_method.area_rec(20, 23);
		System.out.println(area);
	}

}
/*
 	Advantage of Static method is we can call the static method without creating an object,
 	which means a block of memory is not allocated for that method.
 	At the particular instance of time, 
 	if you want to use that method then without creating any memory we can access that method.
*/