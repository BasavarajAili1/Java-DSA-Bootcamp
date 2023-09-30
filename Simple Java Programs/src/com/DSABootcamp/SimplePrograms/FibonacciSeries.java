package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much numbers of fibonacii series have to be printed: ");
		int n = scan.nextInt();
		
		PrintFibonacci(n);

	}
	
	static void PrintFibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		
		if(n == 0) {
			System.out.println(fib1);
		}
		else if(n == 1) {
			System.out.println(fib1 + " " +fib2);
		}
		else if (n > 1) {
			System.out.print(fib1 + " " +fib2+" ");
			// calculate next number
			for (int i=3; i<=n; i++) {
				int nextNo = fib1 + fib2;
				
				System.out.print(nextNo + " ");
				fib1 = fib2;
				fib2 = nextNo; 
			}
			
		}
	}

}
