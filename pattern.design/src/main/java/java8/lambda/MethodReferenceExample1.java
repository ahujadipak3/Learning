package java8.lambda;

import java.util.function.Consumer;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		display("Hellp",System.out:: println);
		
	}
	
	
	public static void display(String message, Consumer<String> consumer) {
		consumer.accept(message);
	}
}
