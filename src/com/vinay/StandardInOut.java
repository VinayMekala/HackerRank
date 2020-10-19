package com.vinay;

import java.util.Scanner;

//read input from stdin (standard input) and write output to stdout (standard output).

public class StandardInOut {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        // Complete this line
        int b = scan.nextInt();
        // Complete this line
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

	}

}
