package interviews;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		try {
			String s = null;
			s.charAt(1);	
		}catch(Exception e) {
			System.out.println("test");
			e.printStackTrace();
		}
		System.out.println("test 2");
		int index = 118 & (15); // 
		System.out.println(index);

		int index1 = 8 & (2); // 1000, 10
		System.out.println(index1);
	}
}
