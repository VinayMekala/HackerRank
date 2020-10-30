package com.vinay;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();

	        Locale india = new Locale("en", "IN");

	        // Write your code here.
	        NumberFormat u =NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat v =NumberFormat.getCurrencyInstance(india);
	        NumberFormat w =NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat x =NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        
	        
	        System.out.println("US: " + u.format(payment));
	        System.out.println("India: " + v.format(payment));
	        System.out.println("China: " + w.format(payment));
	        System.out.println("France: " + x.format(payment));
	        

	}

}
