package com.scan;
import java.util.*;
public class ScanDouble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter double value: ");
		
		double value = input.nextDouble();
		System.out.println("Enter double value "+value);
		input.close();
	}

}
