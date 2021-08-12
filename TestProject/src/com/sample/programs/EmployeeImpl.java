package com.sample.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImpl {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(25, "Dipak", 100l);
		Employee e0 = new Employee(25, "John", 100l);
		Employee e2 = new Employee(29, "Milan", 75l);
		Employee e3 = new Employee(22, "Maulin", 78l);
		Employee e4 = new Employee(32, "Divyesh", 85l);
		Employee e5 = new Employee(34, "Raj", 95l);

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e0);
		
		Collections.sort(list, (Employee c1, Employee c2) -> 
			 c1.getSalary().compareTo(c1.getSalary()) ==0 ? c2.getName().compareTo(c2.getName()) : c1.getSalary().compareTo(c1.getSalary())
			/*
			 * if(result ==0) { result = c2.getName().compareTo(c2.getName()) ; }
			 * //o2.getName().compareTo(o1.getName()) ; return result;
			 */
		);
		
		
		// list.sort(Comparator.);
		
		Collections.sort (list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				int result = o2.getSalary().compareTo(o1.getSalary());
				if(result ==0) {
					result = o2.getName().compareTo(o1.getName()) ;
				}
 				//o2.getName().compareTo(o1.getName()) ;
				return result;
			}
		});
		
		
		System.out.println(list);
		
		
		  Map map= list.stream().filter(e -> e.getAge()> 20) 
		  				.collect(Collectors.groupingBy(e -> e.getName()));
		   				//.forEach(e ->System.out.println(e.getName()));
		  System.out.println(map);
		  
		  list.stream()
		  		.sorted((c1,c2) -> c1.getName().compareTo(c2.getName()))
		  		.forEach(System.out::println);
		  
		  list.stream()
		  		.map(m -> m.getAge())
		  		.reduce(0,(a,b) -> a + b);
	}
}
