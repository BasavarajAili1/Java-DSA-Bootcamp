package com.ArrayDSA.leetcode.easy;

public class ConcatenenationOfArray {

	public static void main(String[] args) {
		int[] nums = {1,3,2,1};
		int[] ans = getConcatenation(nums);
		for(int x: ans) {
			System.out.print(x+" ");
		}
	}

	static int[] getConcatenation(int[] nums) {
		
		int n = nums.length;
		int[] ans = new int[ 2 * nums.length ];
		for(int i=0;i<n;i++) {
			ans[i] = nums[i];
			ans[i+n] = nums[i];
		}
		return ans;
	}


}
