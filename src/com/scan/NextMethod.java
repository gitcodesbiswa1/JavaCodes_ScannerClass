package com.scan;
import java.util.*;
public class NextMethod {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter name");
		
		String value= input.next();
		
		System.out.println("Text entered is "+ value );
		input.close();
	}
}
