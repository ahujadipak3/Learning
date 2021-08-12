package java8.streams;

import java.util.Arrays;
import java.util.List;

public class PeekElements {

	public static void main(String[] args) {
		
		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90),
				new Movie("Lion King", 90));
		// peek is used to troubleshoot
		listOfMovies.stream()
			.filter(m -> m.getLikes() > 50)
			.peek(m -> System.out.println("Title:" +m.getTitle()))
			.map((m) -> m.getTitle())
			.peek((m) -> System.out.println("mapped:"+ m))
			.forEach((m) -> System.out.println(m));
	}
}
