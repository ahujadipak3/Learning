package java8.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] numbers= {1,2,3};
		int key = 0;
		process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / key )));
	}
	
	static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		System.out.println("process");
		for (int i = 0; i < numbers.length; i++) {
			consumer.accept(numbers[i], key);
		}
	}
	
	static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);	
			} catch(Exception e) {
				System.out.println("An exception occured");
			}
			
		};
		
	}
}
