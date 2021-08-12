package interviews;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {

	public static void main(String[] args) {
		String romanValue = "MCMIV";
		Map<String, Integer> negativeChars = new HashMap<String, Integer>();
		negativeChars.put("IV", 3);
		negativeChars.put("IX", 8);
		negativeChars.put("XL", 30);
		negativeChars.put("LC", 40);
		negativeChars.put("CD", 300);
		negativeChars.put("CM", 800);
		
		Map<Character, Integer> mapCharToVal = new HashMap<Character, Integer>();
		mapCharToVal.put('I', 1);
		mapCharToVal.put('V', 5);
		mapCharToVal.put('X', 10);
		mapCharToVal.put('L', 50);
		mapCharToVal.put('C', 100);
		mapCharToVal.put('D', 500);
		mapCharToVal.put('M', 1000);
		
		char previousChar =' ';
		int finalNumber = 0;
		for (int i = 0; i < romanValue.length(); i++) {
			char currentChar = romanValue.charAt(i);
			String twoChars = ""+previousChar+currentChar;
			int intValue = mapCharToVal.get(currentChar);
			if(negativeChars.containsKey(twoChars)) {
				intValue = negativeChars.get(twoChars);
			}
			finalNumber = finalNumber + intValue;
			previousChar = currentChar;
		}
		
		System.out.println(finalNumber);
	}
}
