package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public class Unit1Excercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Dipak", "Ahuja", 28),
				new Person("Shrutika", "Ahuja", 29),
				new Person("Gunesha", "Ahuja", 1));
		
		Collections.sort(people,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		System.out.println(people);
		Collections.sort(people, (o1, o2) -> {
			return o1.getFirstName().compareTo(o2.getFirstName());
		});
		
		System.out.println(people);
		
		people.forEach((p) -> {
			System.out.println(p);
		});
		
		printConditionally(people, (p) -> p.getFirstName().startsWith("G") );
		
	}
	
	static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		people.forEach((p) -> {
			if(predicate.test(p)) {
				System.out.println(p.getFirstName());
			}
		});

	}
 }
