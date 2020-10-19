package com.vinay;

import java.util.Scanner;

/*Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/

public class IfElse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    
	        int N = scanner.nextInt();
	        // As long as you enter invalid number the console ask us to input again
	        while (N<1 || N>100 )
	        {            
	             System.out.println("enter 1 between  to 100");
	             N = scanner.nextInt();	
	             //if you want to exit if it is not placed correctly, uncomment below
	             //System.exit(100);
	        }
	        if (N%2 == 0)
	        {
	            if(N>=2 && N<=5)
	            {
	                System.out.println("Not Weird");
	            }else if(N>=6 && N<=20)
	            {
	                System.out.println("Weird");
	            }else{
	                System.out.println("Not Weird");
	            }

	        }else{
	            System.out.println("Weird");
	        }

	        scanner.close();
	    }

	    

}
