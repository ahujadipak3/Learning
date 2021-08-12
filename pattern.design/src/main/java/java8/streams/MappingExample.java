package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90));
		
		List<String> listOfFamousMovieName = listOfMovies.stream()
			.filter((m) -> m.getLikes()>=60)
			.map(Movie::getTitle)
			.collect(Collectors.toList());
		
		
		listOfFamousMovieName.stream().forEach(System.out::println);
		
		listOfMovies.stream()
			.mapToInt(m -> m.getLikes())
			.forEach((m1) -> System.out.println(m1));
			
	}
}
