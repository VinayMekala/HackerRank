package com.vinay;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
        boolean status = true; 
        String s1 = a.replaceAll("\\s", "");  
        String s2 = b.replaceAll("\\s", ""); 

         if (a.length() != b.length()){
             status = false;
         }
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            java.util.Arrays.sort(ArrayS1);  
            java.util.Arrays.sort(ArrayS2);  
            status = java.util.Arrays.equals(ArrayS1, ArrayS2);   

         return status;
    }


	public static void main(String[] args) {
		
	System.out.println(isAnagram("abc", "cab"));	

	}

}
