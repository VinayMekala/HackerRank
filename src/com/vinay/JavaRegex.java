package com.vinay;

/*
Break the values from 0-255 in following way:

We first need to get values from 250 to 255 by matching against 25[0-5] , 
then values from 200 to 249 can be found by matching against 2[0-4][0-9] 
finally the remaining values will range from 0 to 199 which can be found by [01]?[0-9][0-9]?

Combining all these together gives us any digit(A, B, C or D) < 255 
which again can be added together to form the final IP address. 
Below is the code which passes all the test cases:

public String pattern = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\
.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\
.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\
.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";

*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String pattern = "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
		String st = s.nextLine();
		Boolean b = Pattern.matches(pattern, st);
		System.out.println(b);
		

	}

}
