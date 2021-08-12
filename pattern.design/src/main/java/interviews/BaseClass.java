package interviews;

public class BaseClass {

	/* By making constructor as private, it cannot be sub-classed
	 * private BaseClass() {
	 * 
	 * }
	 */
	
	/**
	 * static method should follow all rules for overriding, but it doesn't override actually.
	 */
	static void display() {
		System.out.println("Baseclass");
	}
	
}
