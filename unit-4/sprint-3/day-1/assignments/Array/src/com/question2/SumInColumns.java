package com.question2;

import java.util.Scanner;

public class SumInColumns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter no of columns: ");
		int columns = sc.nextInt();

		int[][] arr = new int[rows][columns];

		for (int i = 0; i <= rows - 1; i++) {

			for (int j = 0; j <= columns - 1; j++) {
				System.out.println("Enter element for index " + i + " " + j);
				int element = sc.nextInt();
				arr[i][j] = element;
			}

		}

		for (int i = 0; i <= rows - 1; i++) {

			for (int j = 0; j <= columns - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

		for (int j = 0; j <= columns - 1; j++) {
			int evenSum = 0;
			for (int i = 0; i <= rows - 1; i++) {
				if (arr[i][j] % 2 == 0) {
					evenSum += arr[i][j];
				}
			}
			System.out.println(evenSum);
		}

	}

}
