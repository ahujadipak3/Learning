package java8.lambda;

public class RunnableExample {

	
	public static void main(String[] args) {
	
		
		Runnable r1 = () -> {
			printMessage("Hello");
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r1);
		t2.start();
		//t1.start();
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
