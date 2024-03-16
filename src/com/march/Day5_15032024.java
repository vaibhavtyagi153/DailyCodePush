package com.march;


class PalindromeEU {
	
	public boolean revAndIntCheck(int i) {
		int x = i;
		int digit;
		int rev = 0;
		
		while (x > 0) {
			digit = x % 10;
			x = x / 10;			
			
			rev = rev * 10 + digit; 
		}
		
		if(rev == i) {
			return true;
		} else {
			return false;
		}

	}
	
}

public class Day5_15032024 {

	public static void main(String[] args) {
		
		PalindromeEU e = new PalindromeEU();
		
		int biggestPalindrome = 580085;
		
		outerLoop:
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				//System.out.println(i + " " + j);
				int testPass = i * j;
				if (e.revAndIntCheck(testPass) && testPass > biggestPalindrome) {
					
					System.out.println("this is ok");
					System.out.println(i + " " + j);
					System.out.println("this is fine");
					System.out.println(testPass + " is Palindrome");
					break outerLoop;
				}
			}
		}
		
		
		PalindromeChecks p_obj = new PalindromeChecks();
		
		//following not running properly
		//100 to 999
//		outerLoop:
//		for (int i = 999; i >= 100; i--) {
//			
//			for (int j = 999; j >= 100; j--) {
//				
//				int test_num = i * j;
//				if (p_obj.intPalindromeCheck(test_num)) {
//					
//					//580085
//					//995 583
//					System.out.println(test_num);
//					System.out.println(i + " " + j);
//					break outerLoop;
//				}
//				
//			}
//		}
		
		
	}
	
}
