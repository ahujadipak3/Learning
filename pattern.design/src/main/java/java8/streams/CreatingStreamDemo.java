package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamDemo {

	public static void main(String[] args) {
		List<Movie> listOfMovies = Arrays.asList(
				new Movie("3 Idiots", 60),
				new Movie("ZNMD", 50),
				new Movie("Lion King", 90));
		
		// Creating a stream from collection
		
		Stream<Movie> streamFromCollection = listOfMovies.stream();
		
		
		// Creating stream from Arrays
		int[] arr = {1,5,6 };
		IntStream streamFromArray = Arrays.stream(arr);
		
		// Creating from factory of method .. from arbitary number of elements
		Stream<Integer> streamFromFactory = Stream.of(1,4,5);
		
		// Creating from generate method
		Stream.generate(() -> Math.random())
				.limit(15)
				.forEach(System.out::println);
		
		// Creating from iterate method
		Stream.iterate(1, n -> n+1)
			.limit(10)
			.sorted()
			.forEach(System.out::println);
		
	}
}
