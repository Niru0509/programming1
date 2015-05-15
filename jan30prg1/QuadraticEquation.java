package homwork2;
import java.util.*;
public class QuadraticEquation
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discr, root1, root2;
		System.out.println("the quadratic formula");
		     Scanner input1 = new Scanner(System.in);
		 double a = input1.nextDouble();
		 double b = input1.nextDouble();
		 double c = input1.nextDouble();
		 input1.close(); 
		discr = Math.sqrt((b * b) - (4 * a * c));
		System.out.println("Discriminant = " + discr);     
		if(discr==0)
		System.out.println("Equation has no roots");
		else{
		if(discr> 0)
		     {
		System.out.println("Equation has 2 roots");
		        root1 = (-b + discr)/2 * a;
		        root2 = (-b - discr)/2 * a;
		System.out.println("First root = " + root1);
		System.out.println("Second root = " + root2);
		      }
		if(discr == 0)
		      {
		System.out.println("Equation has 1 root");
		        root1 = (-b + discr)/2 * a;
		System.out.println("Root = " + root1);
		      }
		if(discr< 0)
		System.out.println("Equation has no roots");
		

	}
}
			 

}		
	
		     
		
	

