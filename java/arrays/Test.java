package arrays;

public class Test {

	static public void main(String[] xyz) {

		String s1 = "aaabbbeeeerrrd";

		String replaceString = s1.replace("a", "e");// replaces all occurrences of "a" to "e"

		System.out.println(replaceString);

		
		
		String s2 = s1.replaceAll("e*", "a");
		
		System.out.println(s2);
		
		
//		String regex ="";
//		
//		String string = s1.replaceAll(regex," ");
//		
//     System.out.println(string);		
//		
//     
//          char[] array = s1.toCharArray();
//          
//          System.out.println(array);
//		
	}
}