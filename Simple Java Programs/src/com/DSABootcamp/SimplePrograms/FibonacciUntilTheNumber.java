package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

public class FibonacciUntilTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Until which number the series have to be printed: ");
		int n = scan.nextInt();
		
		PrintFibonacci(n);
	}
	
	static void PrintFibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		
		if(n <= 0) {
			System.out.println("No numbers.");
		}
		else if(n == 1) {
			System.out.println(fib1 + " " +fib2);
		}
		else if (n > 2) {
			int nextNo = 0;
			
			System.out.print(fib1 + " " +fib2+" ");
			// calculate next number
			while (nextNo <= n) {

					nextNo = fib1 + fib2;
					if(nextNo > n) {
						break;
					}
					System.out.print(nextNo + " ");
					fib1 = fib2;
					fib2 = nextNo; 
			}
		}
	}
}
