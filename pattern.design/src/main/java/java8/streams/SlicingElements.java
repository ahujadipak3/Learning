package java8.streams;

import java.util.Arrays;
import java.util.List;

public class SlicingElements {

	public static void main(String[] args) {
		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90),
				new Movie("Lion King", 90));
		
		// Skip - Skips the elements
		// limit- limits the elements
		listOfMovies.stream()
		.skip(1)
		.limit(1)
		.forEach(movie -> System.out.println(movie.getTitle()));
		
		//listOfMovies.stream(
	}
}
