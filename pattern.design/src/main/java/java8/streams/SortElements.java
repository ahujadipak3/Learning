package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortElements {

	public static void main(String[] args) {
		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90),
				new Movie("Lion King", 90));
		
		// Sorting with stream.. same way comparable and comparator
		listOfMovies.stream()
					.sorted((m1,m2) -> m1.getTitle().compareTo(m2.getTitle()))
					.forEach(m -> System.out.println(m.getTitle()));;
		System.out.println("Now sorting by likes");
					
		// Using Comparator methods
		listOfMovies.stream()
					.sorted(Comparator.comparing(Movie::getTitle).reversed())
					.forEach(m -> System.out.println(m.getTitle()));;
		//listOfMovies.stream(
	}
}
