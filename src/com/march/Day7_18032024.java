package com.march;


class diffRence {
	
	//sum of squares of first 100 natural number:
	public int sumOfSquares(int term) {
		
		int sum1 = 0;
		
		for(int i = 1; i <= term; i++) {
			sum1 = sum1 + (i * i);
			
		}
		
		return sum1;
	}


//square of sum of first 100 natural numbers
	public int squareOfSum(int n) {
		int sum2 = 0;
		//sn = n/2 * [2a + (n-1)d]
		sum2 = (n/2) * ( 2 * 1 + (n - 1));
		sum2 = sum2 * sum2;
		return sum2;
	}

}

public class Day7_18032024 {

	public static void main(String[] args) {
		diffRence d = new diffRence();
		int a = d.sumOfSquares(100);
		int b = d.squareOfSum(100);
		
		System.out.println(b - a);
		
		
	}

}
