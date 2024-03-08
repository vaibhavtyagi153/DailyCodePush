package com.march;

import java.util.ArrayList;

public class Day2_08032024 {

	public static void main(String[] args) {
		
		int t1 = 1;
		int t2 = 2;
		
		ArrayList<Integer> sum = new ArrayList<>();
		sum.add(t1);
		sum.add(t2);
		
		int t3 = 0;
		
		//array list element counter
		int i = 2; 
		
		
		
		//end result sum
		int sumAdd = 2;
		
		while(true) {
			if (t3<4000000) {
				
				t3 = t1 + t2;
				t1 = t2;
				t2 = t3;
				
				sum.add(i, t3);
				i = i + 1;
				
				
				//adding even numbers
				if (t3%2 == 0) {
					sumAdd = sumAdd + t3;
				}
				System.out.println("term : " + i + " , " + sum.get(i-1));
			}
			else {
				//removing the last irrelevant number in case it's even.
				if (t3%2 == 0) {
					sumAdd = sumAdd - t3;
				}
				
				//to maintain arrayList
				t3 = t1;
				sum.add(i, t3);
				break;
			}
			
		}

		System.out.println("Answer: ");
		System.out.println(sumAdd);
		

	}

}