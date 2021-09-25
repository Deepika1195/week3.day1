package week3.day1;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		String replace = sentence.replace("8", "11");
		replace.substring(5, 14);
		
		System.out.println("replace a specified character with another character -"+replace);
		System.out.println("Print the characters from 5 to 14 -" +replace.substring(5, 14));
}
}