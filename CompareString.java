package week3.day1;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String1="I am Learning Selenium" ;
		String String2="I am learning selenium"  ; 
		
		if(String1==String2) 
		{ System.out.println("type 1 Equal");} else System.out.println("Type 1 not an equal");
		
		if(String1.contains(String2)) 
		{ System.out.println("type 2 Equal");} else System.out.println("Type 2 not an equal");

		if(String1.equalsIgnoreCase(String2)) 
		{ System.out.println("type 3 Equal");} else System.out.println("Type 3 not an equal");
		
	}

}