package homework3;

import java.util.*;

public class AvgOfArray {

	    public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int num[] = new int[10];
		int average = 0;
		int i = 0;
		int sum2=0;	
		for (i = 0; i < num.length; i++) {
			System.out.println("enter a the integers:");
			num[i] = in.nextInt();
			sum2 +=  num[i];		
		}
		in.close();
		average = sum2 / 10;
				
		System.out.println("Average of these numbers =  " + average);
		System.out.println("Numbers greater than the average are: ");
		for (int x=0;x<10;x++){
			if (num[x]>average)
				System.out.print(num[x]+" ");
		
		}

	}

}
