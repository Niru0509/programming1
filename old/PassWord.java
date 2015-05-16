package homework;
import java.util.*;
public class PassWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String password=input.next();
		input.close();
		{  
            System.out.println("Valid Password");  
        } 
       
		  
        }  
	
	 public static boolean isValidPassword(String s){
	if(s.length() < 8)	{	
		return false;}		
	else
	{
		int counter = 1; 
        char ch;  
        for (int i = 0; i < s.length() ; i++) 
        {  
            ch = s.charAt(i);  
            
            if (!Character.isLetterOrDigit(ch)) 
            {          
                return false;  
            } 
            else if (Character.isDigit(ch)) 
            {  
                counter++;  
                if (counter < 2)   
                {     
                    return false;  
                }     
            }  
        }  
	}}} 
   


