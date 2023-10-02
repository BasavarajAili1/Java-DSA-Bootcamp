package com.ArrayDSA.leetcode.easy;

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = { {1, 2, 3},{3, 2, 1}, {4, 5, 6}};
		System.out.println(maximumWealth(accounts));

	}
	static int maximumWealth(int[][] accounts) {
        
		int richWealth = 0;
		for (int i=0;i<accounts.length;i++) {
			int currWealth = 0;
			for (int j=0;j<accounts[i].length;j++) {
				currWealth += accounts[i][j];
			}
			
			if (currWealth > richWealth) {
				richWealth = currWealth;
			}
		}
		return richWealth;
    }
}
