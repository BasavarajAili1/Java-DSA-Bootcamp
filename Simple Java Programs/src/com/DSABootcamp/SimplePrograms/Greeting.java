package com.DSABootcamp.SimplePrograms;
import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.
public class Greeting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name = scan.nextLine();
		
		System.out.println("Hii "+name+". How are you?? ");
	}

}
