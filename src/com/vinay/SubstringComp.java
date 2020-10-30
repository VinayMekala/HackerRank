package com.vinay;

//https://www.hackerrank.com/challenges/java-string-compare/problem
public class SubstringComp {
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.SortedSet<String> sets=new java.util.TreeSet<String>();
        if(s.length()>=k){
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
    }
        System.out.println(sets.first());
        System.out.println(sets.last());
       
        return smallest + "\n" + largest;
        }else {
            System.out.println("Enter a word of min "+ k + "characters");
            return "Enter a word of min "+ k + " characters";

        }
    }

	public static void main(String[] args) {

		getSmallestAndLargest("welcometojava", 3);

	}

}
