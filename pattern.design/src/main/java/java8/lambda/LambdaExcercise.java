package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExcercise {

	public static void main(String[] args) {

		List<People> persons = Arrays.asList(new People("Dipak", "Ahuja", 28), new People("Shrutika", "Ahuja", 28),
				new People("Gunesha", "Ahuja", 0), new People("Dharmesh", "Ahuja", 29));

		Collections.sort(persons, (o1, o2) -> {
			return o1.getLastName().compareTo(o2.getLastName());
		});

		System.out.println(persons);
		performPrint(persons, p1 -> true);
		
		System.out.println("Printing the names starting with D:");
		performPrint(persons, (p1) -> {
			System.out.println("persons"+ persons.get(0));
			return p1.getFirstName().startsWith("D");
		});
	}
	
	
	public static void performPrint(List<People> persons, Predicate<People> prediction) {
		for (People people : persons) {
			if(prediction.test(people))
				System.out.println(people.getFirstName());
		}
	}
}
