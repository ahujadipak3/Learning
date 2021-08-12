package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.lambda.Person;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(p -> {
			for (int i = 0; i < 3; i++) {
				System.out.println(p);
			}
		});
		List<Person> people = Arrays.asList(
			new Person("Dipak", "Ahuja",28),
			new Person("Gunesha","Ahuja",1),
			new Person("Shrutika","Ahuja",28)
		);
		
		List<Person> parents = Arrays.asList(
				new Person("Haresh", "Ahuja",58),
				new Person("Sheela","Ahuja",57)
			);
		
		// filter, map are intermediate operations, and collect is terminal operation
		List<String> filteredList =  people.stream()
		.filter((p) ->  p.getFirstName().startsWith("G"))
		.map(p -> p.getFirstName())
		.collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		Stream<String> stream = filteredList.stream();
		stream.forEach(p -> System.out.println(p));
		stream.forEach(p -> System.out.println(p));
		
		 BinaryOperator<Person> accumulator = new BinaryOperator<Person>(
				 ) {

					@Override
					public Person apply(Person t, Person u) {
						// TODO Auto-generated method stub
						return null;
					}
		};
		Optional<Person> person= people.stream().reduce((Person t, Person u) -> {
				t.setFirstName(t.getFirstName().concat(" "+ u.getFirstName()));
				return t;
			});
		
		System.out.println(person);
		
		Person person1 = people.stream().reduce(person.get(), (Person t, Person u) -> {
			t.setFirstName(t.getFirstName().concat(" "+ u.getFirstName()));
			return t;
		});
		
		System.out.println(person1);
		
		// Stream cannot be reused
		Stream<Person> peopleStream = people.stream();
		peopleStream.findFirst();/*;
		peopleStream.findAny();*/
	
		Stream<String> listOfFirstName = people.stream()
			.map(p -> p.getFirstName());
		
		List<List<Person>> listOfPerson = Arrays.asList(
			people);
		/* Stream<Person> listOfLastName = */listOfPerson.stream()
				.flatMap(p -> p.stream())
						.forEach(p -> System.out.print(p));
		//System.out.println(listOfLastName);
	}
}
