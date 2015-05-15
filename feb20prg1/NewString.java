package methods;
import java.util.Scanner;
public class NewString {

	public static void main(String[] args)
	{
				Scanner input = new Scanner(System.in);
				System.out.println(" enter a string : ");
				String count= input.nextLine();
				System.out.println("The number of letters inside the string is:"  + countLetters(count));
			input.close();
			}		
			public static int countLetters(String s) {
				int lettercount = 0;
				for (int i = 0; i < s.length(); i++) {
					if (Character.isLetter(s.charAt(i)))
						lettercount++;
				}
				return lettercount;
			}			

	}


