package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
