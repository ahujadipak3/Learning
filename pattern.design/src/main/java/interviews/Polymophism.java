package interviews;

class Base {

	public void display() {
		System.out.println("Base - In display");
	}
}

class Child extends Base {
	public void display() {
		System.out.println("Child - In displays");
	}

}

public class Polymophism {
	public static void main(String[] args) {
		Base b = new Child();
		b.display();
	}
}
