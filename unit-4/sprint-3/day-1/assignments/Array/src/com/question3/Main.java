package com.question3;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
//write the logic to iterate through the supplied inputArray and return array of prime
//numbers
//if no prime number is found then return the empty array.
		int index = 0;
		int[] primeArr = new int[inputArray.length];
		boolean flag = false;

		for (int i = 0; i <= inputArray.length - 1; i++) {
			int num = inputArray[i];
			int count = 0;

			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				primeArr[index] = num;
				index++;
				flag = true;
			}
		}
		if (flag == false) {
			return null;
		}
		return primeArr;
	}

	public static void main(String[] args) {
//Create the object of Main class
		Main main = new Main();
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
		int[] arr = { 10, 12, 5, 50, 11, 14, 15 };

//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following
//message:
// "Prime number not found in the supplied Array"
		int[] primeNumberArray = main.findAndReturnPrimeNumbers(arr);

		if (primeNumberArray == null) {
			System.out.println("Prime number not found in the supplied Array");
		} else {
			for (int i = 0; i <= primeNumberArray.length - 1; i++) {
				if (primeNumberArray[i] != 0) {

					System.out.println(primeNumberArray[i]);
				}
			}
		}

	}
}