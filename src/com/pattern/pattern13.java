package com.pattern;

import java.util.Scanner;
public class pattern13 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no of units");
	int n=sc.nextInt();
	int count;
	for(int i=1; i<=5; i++) {
		count=i;
		for(int j=1; j<=5; j++){
		System.out.print(count +" ");
		count=count+n;
	}
	System.out.println();
}
}
}