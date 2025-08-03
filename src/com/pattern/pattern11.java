package com.pattern;


import java.util.Scanner;

public class pattern11 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("hey there");
	System.out.println("enter the no of unites");
	int n=sc.nextInt();
	int count=1;
	for(int i=1; i<=5; i++) {
		
		for(int j=1; j<=5; j++){
		System.out.print(count++ +" ");
	}
	System.out.println();
}
}
}