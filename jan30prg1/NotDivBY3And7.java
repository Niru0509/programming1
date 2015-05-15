package homwork2;

import java.util.Scanner;

public class NotDivBY3And7 {
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		System.out.print(" Enter a number n : ");
		int x = numb.nextInt();

		numb.close();
		for (int i = 1; i <= x; i++) {
			if (!((i % 3 == 0) || (i % 7 == 0)))
				System.out.println(i + " is not  divisible by 3 and7");
		}

	}

}
