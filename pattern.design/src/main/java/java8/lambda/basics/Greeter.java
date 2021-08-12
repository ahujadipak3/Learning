package java8.lambda.basics;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		
		new Greeter().greet(new HelloWorldGreeting());
		
		new Greeter().greet(() -> {
			System.out.println("Hello World");
		});
	}
}
