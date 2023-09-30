package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your two operands/inputs: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Which operation have to be made?");
		char op = scan.next().charAt(0);
		
		if(op == '+') {
			System.out.println(a +" + "+ b +" = "+(a+b));
		}
		if(op == '-') {
			System.out.println(a +" - "+ b +" = "+(a-b));
		}
		if(op == '*') {
			System.out.println(a +" * "+ b +" = "+(a*b));
		}
		if(op == '/') {
			System.out.println(a +" / "+ b +" = "+(a/b));
		}

	}

}
