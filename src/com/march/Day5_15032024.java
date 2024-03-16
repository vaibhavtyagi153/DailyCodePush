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
		int k = 0;
		int p = 0;
		
		int biggestPalindrome = 0;
		
		outerLoop:
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				k = i;
				p = j;
				//System.out.println(i + " " + j);
				int testPass = i * j;
				if (e.revAndIntCheck(testPass)) {
					
					if (testPass > biggestPalindrome) {
						biggestPalindrome = testPass;
					}
				}
			}
		}
		System.out.println(biggestPalindrome);
		
		
		//PalindromeChecks p_obj = new PalindromeChecks();
		
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
