package com.vinay;

import java.util.Scanner;

public class JavaStringsIntro {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        String a,b;
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println(A.length()+B.length());
	        if(A.compareTo(B)>0){
	             System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	       // a=A.substring(0,1).toUpperCase();
	        A=A.replace(A.substring(0,1),A.substring(0,1).toUpperCase());
	        B=B.replace(B.substring(0,1),B.substring(0,1).toUpperCase());
	        System.out.println(A+" "+B);


	}

}
