package java8.streams;

import java.util.Arrays;
import java.util.List;

public class UniqueElemtns {

	public static void main(String[] args) {
		
		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90),
				new Movie("Lion King", 90));
		// distinct is stateful since it has to remember previous elements to compare with current element
		listOfMovies.stream()
			.map((m) -> m.getTitle())
			.distinct()
			.forEach((m) -> System.out.println(m));
	}
}
