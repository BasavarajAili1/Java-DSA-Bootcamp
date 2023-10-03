package com.ArrayDSA.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
Example 1:
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] */
		
public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> res = kidsWithCandies(candies, extraCandies);
		for(Boolean x: res) {
			System.out.print(x+" ");
		}

	}
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>();
        // first find largest candies element
        int largeCandy = 0;
        for(int i=0;i<candies.length;i++) {
        	if(candies[i] > largeCandy) {
        		largeCandy = candies[i];
        	}
        }
        
        // add extra candies to each candy and check it is greater 
        for(int i=0;i<candies.length;i++) {
        	int addedCandy = candies[i] + extraCandies;
        	if (addedCandy >= largeCandy) {
        		res.add(true);
        	}
        	else {
        		res.add(false);
        	}
        }
        return res;
    }
}
