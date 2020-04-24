package com.sapient.keyRead;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	int array[];
	int n; //number of data entries

	
	public void Read(int n){
		
		this.n = n;
		array = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for (int i = 0; i<n ; i++) {
			array[i]=sc.nextInt();
		}	
	}

	public void display() {
		for(int i=0;i<n;i++) {
		  System.out.printf("%d ",array[i]);
		}
		System.out.println();
	}
	
	public void sort() {
		Arrays.sort(array);
	}
	
	public void find(int num) {
		for(int i=0;i<n;i++) {
			if(array[i]==num) {
			 System.out.println("number is present");
			 return;
			}
		}
		System.out.println("number is not present");
	}
	
}
