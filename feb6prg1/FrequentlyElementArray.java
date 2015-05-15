package homework3;

import java.util.*;

public class FrequentlyElementArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner no = new Scanner(System.in);
		System.out.println("enter the size:");
		int size = no.nextInt();
		int[] array1 = new int[size];
		int[] times = new int[size];
		System.out.println("enter the elements of array:");
		for (int j = 0; j< array1.length; j++) {
			array1[j] = no.nextInt();
			times[j] = 1;
		}

	//System.out.println("most common element:" + array1[j]);
		
	no.close();
	}
	}

	


