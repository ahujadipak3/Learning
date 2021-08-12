package com.dipa.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BinaryOperator;

public class FindAllSubSets {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3, 4};
		List<List<Integer>> list = new FindAllSubSets().subsets(nums);
		list.forEach(e -> {
			int sum = e.stream().reduce(0,(Integer t, Integer u) ->  t + u);
			if(sum%4 != 0) {
				System.out.println(e);
			}
		});
		
	}
	public List<List<Integer>> subsets(int[] nums) {
        // 1,2,3
        // [] 1 2 1,2 1,2,3 1 3 2 3
        List<List<Integer>> finalList = new CopyOnWriteArrayList<List<Integer>>();
        List<Integer> tempList = new CopyOnWriteArrayList<>();
        finalList.add(tempList);
        
        for(int i=0; i< nums.length; i++ ) {
        	for(List<Integer> list : finalList) {
        		
        		CopyOnWriteArrayList<Integer> temp = new CopyOnWriteArrayList<>();
        		list.forEach(e -> temp.add(e));
        		temp.add(nums[i]);
        		finalList.add(temp);
        	}
			/*
			 * tempList = new ArrayList<>(); tempList.add(nums[i]);
			 */
         //   finalList.add(tempList);
        	
        }
        System.out.println(finalList);
        return finalList;
    }
}
