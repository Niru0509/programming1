package joptionpane;
import javax.swing.JOptionPane;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sqr = 0;
		String number=JOptionPane.showInputDialog("enter first int");
		try{
		int number1=Integer.parseInt(number);
		if(number1 <= 0) 
			throw new NumberFormatException();

		 sqr=Math.sqrt(number1);
		 JOptionPane.showMessageDialog(null,"the sqr is"+sqr);
		
		}
		catch(NumberFormatException ex){
			System.out.println("Invalid number");
		} 
		finally{
		System.out.println("good bye!");
		
			}
	}

}
