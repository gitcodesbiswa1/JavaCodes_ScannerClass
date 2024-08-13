package com.scan;
import java.util.Scanner;
public class ScanClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String value = input.nextLine();
		System.out.println("Entered name is "+ value);
		input.close();
	}
}
