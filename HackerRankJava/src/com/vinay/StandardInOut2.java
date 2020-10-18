package com.vinay;

import java.util.Scanner;

/*There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.

Note: If you use the nextLine() method immediately following the nextInt() method, 
recall that nextInt() reads integer tokens; because of this, 
the last newline character for that line of integer input is still queued in the input buffer 
and the next nextLine() will be reading the remainder of the integer line (which is empty).*/

public class StandardInOut2 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d=scan.nextDouble();
        //After using next int or any number 
        //we have pending new line in the buffer so taking it by using scan
        scan.nextLine();
        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
