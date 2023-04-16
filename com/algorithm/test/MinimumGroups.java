package com.algorithm.test;

import java.util.HashMap;
import java.util.Map;

public class MinimumGroups {
/*
 * minimum-rounds-to-complete-all-tasks
 * We are given NN integers, we can group them with sizes of two or three. 
 * We need to find out if it's possible to group them and if we can what is the minimum number of groups needed.
 * 
 * First, let's check when we won't be able to group the integers. 
 * Since the minimum size of the group is 22, we cannot cover the integer with frequency 11. 
 * To find the minimum number of groups for other integers, we can divide the integers into three groups:
 * 
 * Integers that are multiples of 3 i.e., of the form 3*K.
Integers that leaves remainder of 1 when divided by 3 i.e., of the form 3 * K + 1.
Integers that leaves remainder of 2 when divided by 3 i.e., of the form 3 * K + 2.
 */

	    public int minimumRounds(int[] tasks) {
	        Map<Integer, Integer> freq = new HashMap();
	        // Store the frequencies in the map.
	        for (int task : tasks) {
	            freq.put(task, freq.getOrDefault(task, 0) + 1);
	        }

	        int minimumRounds = 0;
	        // Iterate over the task's frequencies.
	        for (int count : freq.values()) {
	            // If the frequency is 1, it's not possible to complete tasks.
	            if (count == 1) {
	                return - 1;
	            }

	            if (count % 3 == 0) {
	                // Group all the task in triplets.
	                minimumRounds += count / 3;
	            } else {
	                // If count % 3 = 1; (count / 3 - 1) groups of triplets and 2 pairs.
	                // If count % 3 = 2; (count / 3) groups of triplets and 1 pair.
	                minimumRounds += count / 3 + 1;
	            }
	        }

	        return minimumRounds;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumGroups mg =new MinimumGroups();
		int tasks[] = {12,6,18,9,21};
		System.out.println(mg.minimumRounds(tasks));
	}

}
