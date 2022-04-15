package day2;

public class String_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String Object:");
		System.out.println("--------------");
		String s1=new String("Aditya");
		System.out.println("Before Concat: "+s1);							//Aditya
		s1.concat("Engineering");											//Aditya Engineering
		System.out.println("After Concat without reference object: "+s1);	//Aditya
		s1=s1.concat(" Engineering");										//s1=Aditya Engineering
		System.out.println("After Concat with reference object: "+s1);
		
		System.out.println("\nString Buffer Object:");
		System.out.println("-----------------------");
		StringBuffer s2=new StringBuffer("Aditya");
		System.out.println("Before Concat: "+s2);							//Aditya
		s2.append(" Engineering");											//Aditya Engineering
		System.out.println("After Concat without reference object: "+s2);
	}

}

/*OUTPUT:
  ------  
		String Object:
		--------------
		Before Concat: Aditya
		After Concat without reference object: Aditya
		After Concat with reference object: Aditya Engineering
		
		String Buffer Object:
		-----------------------
		Before Concat: Aditya
		After Concat without reference object: Aditya Engineering
*/
/*
String Object is immutable. It cannot be updated.
----------------------------------------------------	
	String s1=new String("Aditya");
	s1.concat("Engineering");
	output:
	------
		Before Concat: Aditya
		After Concat: Aditya
 In this case, the content is concatenated but it is not updated. 
 So that, we need to create a reference variable to store the concatenated string.
 i.e;
 	String s1=new String("Aditya");
 	s1=s1.concat(" Engineering");
 	output:
 	-------
 		Before Concat: Aditya
		After Concat: Aditya Engineering
	here, String Object s1 is not updated but it was recreated.
	It stored the concatenated string as a new String object.
 	
 
 StringBuffer is mutable in nature and can be updated.
 ------------------------------------------------------
 	StringBuffer s2=new StringBuffer("Aditya");
	s2.append(" Engineering");
	output:
	-------
		Before Concat: Aditya
		After Concat: Aditya Engineering
In this case, the content is concatenated as well as updated.
There is no need of reference variable to store the appended/concatenated string.
*/
