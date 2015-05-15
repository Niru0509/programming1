package homework3;

import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner no = new Scanner(System.in);
		System.out.println("enter the array1:");
		int size1 = no.nextInt();
		int[] array1 = new int[size1];
		for (int i = 0; i < array1.length; i++)
			array1[i] = no.nextInt();
		System.out.println("enter the array2:");
		int size2 = no.nextInt();
		int[] array2 = new int[size2];
		for (int i = 0; i < array2.length; i++)
			array2[i]=no.nextInt();
		if (equal(array1, array2)) {
			System.out.println("Two arrays are identical:");
		} else {
			System.out.println("Two arrays are not indentical:");
			no.close();
		}
	}
	
	public static boolean equal(int[] array1, int[] array2) {
		if (array1.length == array2.length)
			Arrays.sort(array1);
		Arrays.sort(array2);
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}
		return true;
	}
}