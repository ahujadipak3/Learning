package interviews;

import java.util.HashMap;

public class HashCodeImpl {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Dipak", "dipak@gmail.com");
		Employee e2 = new Employee(2, "Shruti", "shruti@gmail.com");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		//HashMap<K, V>
	}
}
