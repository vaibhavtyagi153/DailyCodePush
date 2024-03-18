package com.march;

public class Day6_16032024 {

	public static void main(String[] args) {
	
	
	int result = 21;
	
	int count = 0;
	
	
	//outerLoop:
	while (true) {
		
		count = 0;
		
		for (int i = 1; i <= 20; i++) {
						
			if(result % i != 0) {
				break;
			}
			
			else {
				count = count + 1;
			}
			
		}
	
	
		if (count == 20) {
			System.out.println("divisible");
			System.out.println("the value of result: " + result);
			break;
		} 
		
		result = result + 1;
		
	}
		
	

	}

}
