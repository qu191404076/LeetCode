package string;

/**
 * Detect Capital
 * 
 * @author Administrator Given a word, you need to judge whether the usage of
 *         capitals in it is right or not.
 * 
 *         We define the usage of capitals in a word to be right when one of the
 *         following cases holds:
 * 
 *         All letters in this word are capitals, like "USA". All letters in
 *         this word are not capitals, like "leetcode". Only the first letter in
 *         this word is capital if it has more than one letter, like "Google".
 *         Otherwise, we define that this word doesn't use capitals in a right
 *         way. Example 1: Input: "USA" Output: True Example 2: Input: "FlaG"
 *         Output: False
 */
public class DetectCapital {

	public static boolean detectCapital(String words) {
		int cnt = 0;
		for (char c : words.toCharArray()) if ('Z' - c >= 0) cnt++;
		return ((cnt == 0 || cnt == words.length()) || (cnt == 1 && 'Z' - words.charAt(0) >= 0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "USA";
		System.out.println(detectCapital(words));
	}

}
