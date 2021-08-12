

public class FibonacciWithLimit {

	public static void main(String[] args) {

		new FibonacciWithLimit().printFibonacciNumbers(10);
		
	}
	
	public void printFibonacciNumbers(int limit) {
		
		if(limit <1) {
			return;
		}
		
		int a =1;
		int b =1;
		int result =0;
		System.out.println(a);
		System.out.println(b);
		
		while(true) {
			result = a +b;
			a = b;
			b = result;
			if(result > limit) {
				break;
			}
			System.out.println(result);
		}
		
	}
	
}
