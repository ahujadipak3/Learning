package java8.lambda;

@FunctionalInterface
public interface FunctionalInterfaceSample{
	
	public static final int var1 =10; 
	
	void display(String message);
	
	static void display2(String message) {
		System.out.println("display 2");
	}
	//boolean equals(Object obj);

	default void display4(String message) {
		System.out.println("display 4 parent");
	}
}
