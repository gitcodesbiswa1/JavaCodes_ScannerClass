package com.scan;
import java.util.*;
public class ScanInt {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int data1 = input.nextInt();
		System.out.println("Entered integer is " + data1);
		input.close();
	}

}
