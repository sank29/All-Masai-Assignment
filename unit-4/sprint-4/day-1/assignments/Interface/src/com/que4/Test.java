package com.que4;

public class Test implements Intr {

	public static boolean checkPrime(int num) {

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	@Override
	public int[] display(int p) {

		int[] primeArray = new int[p];
		int j = 0;
		for (int i = 2; i <= p; i++) {
			if (checkPrime(i)) {
				primeArray[j] = i;
				j++;
			}
		}

		return primeArray;
	}

//	@Override
//	public String toString() {
//		
//		return super.toString();
//	}

}
