package java8.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionIteration {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4);
		
		/*
		 * for (Integer integer : intList) { System.out.println(intList.get(integer)); }
		 */
		
		
		Optional<Integer> intfirst = intList.stream().findFirst();
		System.out.println("first "+ intfirst.get());
		
		Optional<Integer> max = intList.stream().max((o1,o2) -> o1.compareTo(o2));
		System.out.println("first "+ max.get());
		
		Stream<Integer> ma1x = intList.stream().filter((i) -> i>2);
		 ma1x.forEach(System.out::println);
		
		Iterator<Integer> iter = intList.iterator();
		
		intList.forEach(System.out::print);
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (Iterator iterator = intList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Dipak");
		map.put(2, "Gunesha");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator setIterator = entrySet.iterator();
		while(setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		
		
		map.forEach((i,s) -> System.out.println("" + i + " "+ s));
		
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		Iterator<Integer> setIter = hashSet.iterator();
		while(setIter.hasNext()) {
			System.out.println(setIter.next());
		}
		
		hashSet.forEach((i) -> System.out.println("i"+i));
		
	}
}
