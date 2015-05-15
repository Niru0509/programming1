package homwork2;

import java.util.Scanner;

public class IntegerInBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num;
  int bit=1;
  int temp;
  int bin;
  System.out.println("Enter the short integer : ");
	Scanner input = new Scanner(System.in);
num = input.nextShort();
	for(int i = 15; i>=0 ; i --)
	{
	temp = num >> i;
	bin = bit & temp ;
	System.out.print(bin);
	}
	input.close();

	}
}
