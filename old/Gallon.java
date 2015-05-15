import java.util.Scanner;

public class Gallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double liters , gallons ;
		Scanner numb = new Scanner(System.in);
		System.out.print("NO OF GALLONS TO CONVERT :");
		gallons=numb.nextDouble();
	    liters = gallons * 3.785;
	    System.out.println("Amount in liters = " + liters);
		numb.close();
	}

}
