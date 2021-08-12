package interviews;

public class FinallyClass {

	public static void main(String[] args) {
		try {
			System.out.println("Try");
			//System.exit(0);
			throw new Exception("Test");
			//return;
		}catch(Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("Finally clause");
		}
	}
}
