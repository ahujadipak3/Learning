package java8.lambda;

import java.util.function.Predicate;

public class ClosuresExample {
	
	private int c = 23;
	public static void main(String[] args) {

		
		new ClosuresExample().performOperation();
	}
	
	public void performOperation() {
		int b =10;
		c = 68;
		//this.c = 65;
		printConditionally(25, (i) -> i > c);
	}
	
	public static void printConditionally (int i, Predicate<Integer> predicate) {
		if(predicate.test(i)) 
			System.out.println(i);
	}
}
