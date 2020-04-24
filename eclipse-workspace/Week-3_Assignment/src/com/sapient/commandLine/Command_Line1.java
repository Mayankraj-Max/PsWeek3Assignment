package com.sapient.commandLine;

import java.util.Scanner;

public class Command_Line1 {
	int[] array;
	int n,sum,biggest,smallest;
	float avg;
	

	public void setData(int n) {
		this.n = n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the elements");
		array =  new int[n];
		for( int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
	}
	
	public void calData() {
		
		sum = 0;
		biggest = array[0];
		smallest = array[0];
		for(int i=0;i<n;i++) {
			sum = sum + array[i];
			
			if(array[i]>biggest)
				 biggest = array[i];
			
			if(array[i]<smallest)
				 smallest = array[i];
		}
			
		avg = (float)sum/n;
	}

	public void displayData() {
	
		
		System.out.printf("Sum =  %d Biggest = %d Smallest = %d Average = %f",sum,biggest,smallest,avg);	
	}
}
