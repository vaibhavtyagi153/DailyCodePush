package com.march;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//palindrome problem statements:




class PalindromeChecks {
	
	public void palindromStringCheck(String s) {
		//removing whitespaces
		String s1 = s.replaceAll("\\s+", "").toLowerCase();
		System.out.println("Value of s1: " +  s1);
		String revS = reverse(s1);
		if(revS.equals(s1)) {
			System.out.println("Match");
		} else {
			System.out.println("noMatch");
		}
	}
	
	
	public String reverse(String s) {
		String reverse = "";
		
		for(int i = s.length() - 1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		
		return reverse;
	}
	
}


public class Day3_11032024 {

	public static void main(String[] args) {
		
		String inputString = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a String: ");
		
		try {
			inputString = reader.readLine();
			
			System.out.println("You entered: " + inputString);
			
		} catch(IOException e) {
			System.out.println("Error Occured during reading input: " + e.getMessage());
		} finally {
			try {
				reader.close();
			} catch(IOException e) {
				System.out.println("Error encounterd while closing reader: " + e.getMessage());
			}
		}
		
		PalindromeChecks p = new PalindromeChecks();
		
		p.palindromStringCheck(inputString);
		
		System.out.println("Ending the code");
		
		
		
	}

}
