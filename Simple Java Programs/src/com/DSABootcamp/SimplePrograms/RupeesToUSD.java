package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// Input currency in rupees and output in USD
public class RupeesToUSD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount in INR: ");
		
		int rupees = scan.nextInt();
		
		float USD = rupees / 83.18f;
		
		System.out.printf("INR in USD -> %.2f\n",USD);
	}

}
