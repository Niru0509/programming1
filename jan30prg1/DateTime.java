package Homework1;
import java.util.*;
public class DateTime {
static int  day,month, year;
static int second,minute,hour;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar date = new GregorianCalendar();
	
	      day = date.get(Calendar.DAY_OF_MONTH);
	      month = date.get(Calendar.MONTH);
	      year = date.get(Calendar.YEAR);
	 
	      second = date.get(Calendar.SECOND);
	      minute = date.get(Calendar.MINUTE);
	      hour = date.get(Calendar.HOUR);
	 
	      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
	      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
	   }
		
	}


