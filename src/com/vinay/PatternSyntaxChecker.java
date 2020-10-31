package com.vinay;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format

The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes


Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
		
Sample Output

Valid
Invalid
Invalid*/

public class PatternSyntaxChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testcases = Integer.parseInt(scanner.nextLine());
		while (testcases > 0) {
			String pattern = scanner.nextLine();
			try {
				Pattern p=Pattern.compile(pattern);
				System.out.println("Valid");
			}catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }			
			testcases--;
		}

	}

}
