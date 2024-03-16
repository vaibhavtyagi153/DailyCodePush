package com.march;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//palindrome problem statements:




class PalindromeChecks {
	
	public boolean palindromStringCheck(String s) {
		//removing whitespaces and LowerCase scenario
		String s1 = s.replaceAll("\\s+", "").toLowerCase();
		String revS = reverse(s1);
		if(revS.equals(s1)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean intPalindromeCheck(int n) {
		String str = String.valueOf(n);
		if(palindromStringCheck(str)) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public int nextIntPalindrome(int n) {
		
		while(true) {
			
			n++;
			if(intPalindromeCheck(n)) {
				break;
			} 
			
		}
		return n;
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
		
//		String inputString = "";
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enter a String: ");
//		
//		try {
//			inputString = reader.readLine();
//			
//			System.out.println("You entered: " + inputString);
//			
//		} catch(IOException e) {
//			System.out.println("Error Occured during reading input: " + e.getMessage());
//		} finally {
//			try {
//				reader.close();
//			} catch(IOException e) {
//				System.out.println("Error encountered while closing reader: " + e.getMessage());
//			}
//		}
		
		PalindromeChecks p = new PalindromeChecks();
		
//		boolean b = p.palindromStringCheck(inputString);
//		displayResult(inputString, b);
		
		int i1= 411;
//		boolean a = p.intPalindromeCheck(i1);
//		displayResult(i1, a);
		
		int a1 = p.nextIntPalindrome(i1);
		displayResult(a1);
		
		
	}
	
	public static void displayResult(String s, boolean b) {
		if (b) {
			System.out.println(s + " is Palindrome");
		} else {
			System.out.println(s + " is not Palindrome");
		}
	}
	
	public static void displayResult(int i, boolean b) {
		if (b) {
			System.out.println(i + " is palindrome");
		} else {
			System.out.println(i + " is not Palindrome");
		}
	}
	
	public static void displayResult(int i) {
		
		System.out.println(i + " is palindrome");
	}

}
