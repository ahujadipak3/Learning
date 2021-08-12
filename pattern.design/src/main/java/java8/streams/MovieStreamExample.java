package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieStreamExample {
	public static void main(String[] args) {

		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90));
		
		// Get the movies
		
		long numberOfMoviesWithMoreLikes = listOfMovies.stream()
			.filter(m -> m.getLikes()> 55)
			.count();
		
		System.out.println(numberOfMoviesWithMoreLikes);
	}
}
