

import java.util.Scanner;
public class pattern17 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no of units");
	int n=sc.nextInt();
	int count;
	for(int i=1; i<=n; i++) {
		count=i;
		for(int j=1; j<=i; j++) {
		System.out.print (count +" ");
		count++;
	}
	System.out.println();
}
}
}