package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter value: ");
		int n1 = in.nextInt();	
		System.out.println("Enter second value: ");
		int n2 = in.nextInt();
		System.out.println("Average: ");
		System.out.print((n1+n2)/2.0);	
	
	}
}
