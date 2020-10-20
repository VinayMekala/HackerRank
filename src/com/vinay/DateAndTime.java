package com.vinay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {

	  public static String findDay(int month, int day, int year) {
	        
		    String dateString = String.format("%d-%d-%d",year,month,day);
		    Date date=null;
		    try{
		        date= new SimpleDateFormat("yyyy-M-d").parse(dateString);
		    
		       }catch (ParseException e) {
		                // TODO Auto-generated catch block
		               e.printStackTrace();
		     }
		    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		    return dayOfWeek.toUpperCase(); // Friday

		}
	  
	public static void main(String[] args) {
		
		System.out.println(DateAndTime.findDay(8,5,2015));

	}

}
