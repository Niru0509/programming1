package sorting;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner input= new Scanner(System.in);
		    System.out.println("Enter the string:");
		    String str=input.nextLine();
		    System.out.println("Enter the letter:");
		    char a= (char) input.nextInt();
		   int letterCheck = CountString.Count(str, a);
	        System.out.println("The word was: " + str);
	        System.out.println("The letter " + a + " was found this many times: " + letterCheck);
	        input.close();    	
		    }

	private static int Count(String str, char a) {
		for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == a)
            {        
            } 
	
	}
		return a;
	}

}



