package string;

/**
 * Reverse Words in a String III
 * 
 * @author Administrator Given a string, you need to reverse the order of
 *         characters in each word within a sentence while still preserving
 *         whitespace and initial word order.
 * 
 *         Example 1: Input: "Let's take LeetCode contest" Output:
 *         "s'teL ekat edoCteeL tsetnoc" Note: In the string, each word is
 *         separated by single space and there will not be any extra space in
 *         the string.
 */
public class ReverseWordsInAStringIII {
	
	public static String reverseWordsInAStringIII(String words){
		String[] stringArrays = words.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String word : stringArrays){
			char[] chars = word.toCharArray();
			for(int i = chars.length - 1; i > -1; i--){
				sb.append(String.valueOf(chars[i]));
			}
			sb.append(" ");
		}
		String result = sb.toString();
		return result;
	}
	
	public static String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "Let's take LeetCode contest";
		System.out.println(reverseWords(words));
	}

}
