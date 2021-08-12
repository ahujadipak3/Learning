package interviews;

public class IntegerToRoman {

	
	public static void main(String[] args) {
	
		Integer number = 45600;
		//int amount = 0;
		int twoThousands = number/2000;
		System.out.println(twoThousands);
		int remainingAmount = number - 2000 * twoThousands;
		int fiveHundereads = (remainingAmount)/500;
		System.out.println(fiveHundereads);
		remainingAmount  = remainingAmount - 500 * fiveHundereads;
		System.out.println(remainingAmount/100);
		//System.out.println(number/10);
		//System.out.println(number/10);
	}
}
