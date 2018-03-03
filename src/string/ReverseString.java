package string;

/**
 * Reverse String
 * 
 * @author Administrator Write a function that takes a string as input and
 *         returns the string reversed.
 * 
 *         Example: Given s = "hello", return "olleh".
 */
public class ReverseString {

	public static String reverseString(String words) {
		String wordsTrim = words.trim();
		StringBuffer sb = new StringBuffer(wordsTrim).reverse();
		String result = sb.toString();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "hello";
		System.out.println(reverseString(words));
	}

}
