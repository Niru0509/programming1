package ownprogrames;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		
		int number = input.nextInt();
		System.out.println("reverse Value  ");		
		reverse(number);
		input.close();
}
	
	public static  void reverse(int n)
	 {
		int reverse;
		 while( n != 0 )
	      {
	          reverse = n%10;
	          System.out.print(reverse);
	          n = n/10;	         
	      }	
			 
	 }	
	
}