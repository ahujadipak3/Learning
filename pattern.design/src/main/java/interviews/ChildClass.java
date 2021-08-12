package interviews;

public class ChildClass extends BaseClass {

	
	static void display() {
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		BaseClass c1 = new ChildClass();
		c1.display();
		
		ChildClass c2 = new ChildClass();
		c2.display();
	}
}
