package pattern.design;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class BuilderPattern {
	public static void main(String[] args) {
		Salary s = new Salary.Builder().salaryAmt(50L).employeeNo(0).build();
		//Salary s = new Salary.Builder().salaryAmt(50L).employeeNo(0).build();
		System.out.println(s);
		
		//new Salary.Builder().notifyAll();
		String s1 = new Object().toString().replace("0", "1");
		
		//String s1 =  Calendar.getInstance();
		List<String> list = new ArrayList<String>();
		list.add("Name1");
		list.add("Name2");
		list.add("Name4");
		list.add("Name3");
		/*
		 * Collections.sort(list,new Comparator<String>() {
		 * 
		 * public int compare(String o1, String o2) { // TODO Auto-generated method stub
		 * System.out.println("o2 and o1 are :"+ o2 + " " + o1 + " " +
		 * o2.compareTo(o1)); return o1.compareTo(o2); }
		 * 
		 * });
		 * 
		 * System.out.println(list);
		 */
		
	      Collections.sort(list, (s5, s2) -> s5.compareTo(s2));
	      
	      List<Integer> list1 = new ArrayList<Integer>();
			list1.add(1);
			list1.add(2);
			list1.add(4);
			list1.add(3);
	      
	      eval(list1,   new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2 == 0;
			}
		});

	}
	
	
	
	 public static void eval(List<Integer> list, Predicate<Integer> predicate) {

	      for(Integer n: list) {

	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
	
	
}
