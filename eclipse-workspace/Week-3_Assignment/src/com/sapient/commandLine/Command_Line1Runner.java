package com.sapient.commandLine;

import java.util.Scanner;

public class Command_Line1Runner {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements");
		
		n = s.nextInt(); 
	 
		Command_Line1 obj = new Command_Line1();
		obj.setData(n);
		obj.calData();
		obj.displayData();

	}

}
