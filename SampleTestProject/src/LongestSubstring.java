import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	// abcdefgaij
	
	public static void main(String[] args) {
		String testString = "abcdefgaijj";
		int longestSubstrLength = 0;
		String longestSubstr = "";
		for (int i = 0; i < testString.length()-1; i++) {
			for(int j=i+1; j < testString.length(); j++) {
				
				String tempSubStr = testString.substring(i, j);
				//System.out.println("tempSubStr: "+ tempSubStr);
				if(isValidSubString(tempSubStr)) {
					//System.out.println("valid substr: "+ tempSubStr.length());	
					int currentSubStrLenght = tempSubStr.length();
					if(currentSubStrLenght > longestSubstrLength) {
						//System.out.println("assigning longestsubstr: "+ tempSubStr);	
						longestSubstr = tempSubStr;
						longestSubstrLength = tempSubStr.length();
					}
				}
			}
		}
		System.out.println(longestSubstr);
	}

	private static boolean isValidSubString(String substring) {
		Set<Character> characterSet = new HashSet<>();
		for (int i = 0; i < substring.length(); i++) {
			if(characterSet.contains(substring.charAt(i))) {
				return false;
			}
			characterSet.add(substring.charAt(i));
		}
		return true;
	}
}
