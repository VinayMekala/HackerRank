package com.vinay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.


public class EndOfFile {

	public static void main(String[] args) {
		
        Scanner scanner= new Scanner(System.in);
        ArrayList s= new ArrayList();
        while(scanner.hasNextLine()){
             String x=scanner.nextLine();
             s.add(x);
        }
        Iterator it = s.iterator();
        int i=1;
        while(it.hasNext()){
            
            System.out.print(i+" "+it.next()+"\n"); 
            i++;
        }


	}

}
