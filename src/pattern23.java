

import java.util.Scanner;
public class pattern23 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no of units");
	int n=sc.nextInt();
    
	for(int i=0; i<=n; i++) {
		int k=1;
		
		for(int j=0; j<=i; j++) {
		System.out.print (k+"");
		k=1-k;
		
	}
	System.out.println();
}
	sc.close();
}
}
