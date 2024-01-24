package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int y = in.nextInt();
	
		boolean leapYear = true; 
		
		System.out.println(y%4==0 && y%100>0);		
	}

}
