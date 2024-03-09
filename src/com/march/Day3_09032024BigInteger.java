package com.march;

import java.math.BigInteger;


class FactorBigInt {

	PrimeCheckBigInt p = new PrimeCheckBigInt();

	public void factorListBig(BigInteger n) {
		
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			if(n.mod(i).equals(BigInteger.ZERO)) {
				System.out.println(i);
				if(p.primeCheckBig(i)) {
					System.out.println(i + " is prime");
				}
			}
		}
	}
}

class PrimeCheckBigInt {
	
	public boolean primeCheckBig(BigInteger numToCheck) {
		
		if (numToCheck.compareTo(BigInteger.ONE) <= 0)	{
			return false;
		}
		
		BigInteger two = BigInteger.valueOf(2);
		
		for (BigInteger i = two; i.compareTo(numToCheck) <= 0; i = i.add(BigInteger.ONE)) {
			if (numToCheck.mod(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		
		return true;
		
		
	}
	
}

public class Day3_09032024BigInteger {

	public static void main(String[] args) {
		
		FactorBigInt factors = new FactorBigInt();
		
		factors.factorListBig(new BigInteger("600851475143"));
		System.out.println("The end");

	}

}
