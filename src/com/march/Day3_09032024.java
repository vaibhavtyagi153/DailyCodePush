package com.march;

import java.math.BigInteger;

class Factors {
	
	PrimeCheck p = new PrimeCheck();
			
	public void factorList(int n) {	
		
		for(int i = 1; i <= n; i++) {
			
			if (n%i == 0) {
				System.out.println(i);
				if (p.primeCheck(i)) {
					System.out.println(i + " is prime");
				}
			}
			
			
		}
	}
	
	
}

//to check if a number is prime or not;
class PrimeCheck {
	
	public boolean primeCheck(int numToCheck) {
		
		if (numToCheck <= 1) {
			return false;
		}
				
		for (int i = 2; i <= Math.sqrt(numToCheck); i++) {
			
			if (numToCheck % i == 0) {
				return false;
			}
			
		}
		
		return true;
				
		
	}
	
}





public class Day3_09032024 {

	public static void main(String[] args) {
		
		int num = 13195;
		//BigInteger bignum = BigInteger.valueOf(600851475143);
		
		Factors f = new Factors();
		//f.factorList(new BigInteger("600851475143"));
		f.factorList(num);
	}

}
