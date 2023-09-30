package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// Print fibonacci number of nth number
public class PrintFibonacciOfGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter N");
		int n = scan.nextInt();
		
		PrintFibonacciNumber(n);
	}
	
	static void PrintFibonacciNumber(int n) {
		long fib1 = 0;
		long fib2 = 1;
		
		if(n == 0) {
			System.out.println(fib1);
		}
		else if (n <= 2) {
			System.out.print(fib2);
		}
		else if (n > 2) {
			// calculate next number
			long nextNo = 0;
			for (int i=2; i<=n; i++) {
				nextNo = fib1 + fib2;

				fib1 = fib2;
				fib2 = nextNo; 
			}
			System.out.println(nextNo);
		}
	}
}
