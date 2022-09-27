package com.masai;

public class PrimeFactors {
	static void primeFactors(int num) {
		if(num>100) {
			System.out.println("Invalid Number");
		}else {
			for(int i=1; i<=num; i++) {
				if(num%i ==0)
					System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactors(12);

	}

}
