package homwork2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);

		String names = "";
		String reverse = "";
		System.out.println("enter the name:");
		names = name.nextLine();
		name.close();
		int length = names.length();
		for (int i = length - 1; i >= 0; i--)
			reverse += names.charAt(i);

		System.out.println("Reverse of entered string is: " + reverse);

	}

}
