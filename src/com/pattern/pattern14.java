package com.pattern;


import java.util.Scanner;
public class pattern14 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no of units");
	int n =sc.nextInt();
	for(int i=1; i<=5; i++) {
		
		for(int j=1; j<=i; j++) {
		System.out.print("* ");
	}
	System.out.println();
}
}
}
