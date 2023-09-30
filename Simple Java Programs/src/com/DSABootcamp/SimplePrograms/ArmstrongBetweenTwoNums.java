package com.DSABootcamp.SimplePrograms;

import java.util.Scanner;

public class ArmstrongBetweenTwoNums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int firstNum = scan.nextInt();
		int secNum = scan.nextInt();
		
		int firstRes = checkArmstrong(firstNum);
		int secRes = checkArmstrong(firstNum);
		if (firstNum == firstRes) {
			System.out.println(firstNum+" is Armstrong number");
		}
		else {
			System.out.println(firstNum+" is not Armstrong number");
		}
		if (secNum == secRes) {
			System.out.println(secNum+" is Armstrong number");
		}
		else {
			System.out.println(secNum+" is not Armstrong number");
		}
	}
	public static int checkArmstrong(int n) {
		// count the number of digits of the number
		int org = n; // store it in another var for checking its sum..
		int count = 0;
		int digit = 0;
		while(n != 0) {
			digit = n % 10; // take last digit
			count++;
			n = n / 10; // remove last digit
		}
		
		int sum = 0;
		while (org != 0) {
			digit = org % 10;
			sum = sum + ((int) Math.pow(digit, count));
			org = org / 10;
		}
		return sum;
	}
}
